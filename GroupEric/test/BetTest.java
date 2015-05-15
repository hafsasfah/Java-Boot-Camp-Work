import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.*;


public class BetTest {

	iPlayer player1;
	iPlayer player2;
	int wager;
	Bet bet;
	
	@Before
	public void setUp() throws Exception {
		player1 = mock(iPlayer.class);
		player2 = mock(iPlayer.class);
		wager = 50;
		bet = new Bet( player1, player2, wager);
	}

	@Test
	public void testBet() 
	{
		assertNotNull(bet);
	}

	@Test
	public void testRace() {
		String player1Name = "Eric";
		String player2Name = "John";
		when(player1.getName()).thenReturn(player1Name);
		when(player2.getName()).thenReturn(player2Name);
		
		iVehicle vehicle1 = mock(iVehicle.class);
		iVehicle vehicle2 = mock(iVehicle.class);
		
		when(vehicle1.getQuarterMileTime()).thenReturn(1.0);
		when(vehicle2.getQuarterMileTime()).thenReturn(2.0);
		
		String vehicle1Name = "Yellow Ford Transit";
		String vehicle2Name = "Blue Ford Focus";
		when(vehicle1.toString()).thenReturn(vehicle1Name);
		when(vehicle2.toString()).thenReturn(vehicle2Name);
		
		when(player1.getVehicle()).thenReturn(vehicle1);
		when(player2.getVehicle()).thenReturn(vehicle2);
		
		assertEquals( bet.race(), String.format("%s in a %s beats %s in a %s", player1Name, vehicle1Name, player2Name, vehicle2Name ));
		
		/*
	 	if ( player1.getVehicle().getQuarterMileTime() < player2.getVehicle().getQuarterMileTime() )
		{
			player1.addCash(wager);
			player2.addCash(wager * -1 );
			return player1.getName() + " in a " + player1.getVehicle().toString()
					+ " beats " + player2.getName() + " in a " + player2.getVehicle().toString();
		}
		else
		{
			player1.addCash(wager * -1);
			player2.addCash(wager);
			return player1.getName() + " in a " + player1.getVehicle().toString()
					+ " loses to " + player2.getName() + " in a " + player2.getVehicle().toString();
		}
		 */
	}
}
