import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class PartyTest {

	private Party party;
	private ICharacter[] mockCharacters;
	
	@Before
	public void setUp() throws Exception {
		mockCharacters = new ICharacter[3];
		mockCharacters[0] = mock(ICharacter.class);
		mockCharacters[1] = mock(ICharacter.class);
		mockCharacters[2] = mock(ICharacter.class);
		
		party = new Party(mockCharacters);
	}

	@Test
	public void testParty() {
		assertNotNull( party );
	}

	@Test
	public void testGetCharacters() {
		for ( int index = 0; index < party.getCharacters().length; index++ )
		{
			assertEquals( party.getCharacters()[index], mockCharacters[index]);
		}
	}

	@Test
	public void testIsAnyCharacterInPartyAlive() {
		when(mockCharacters[0].isAlive()).thenReturn(true);
		when(mockCharacters[1].isAlive()).thenReturn(true);
		when(mockCharacters[2].isAlive()).thenReturn(true);
		
		assertTrue( party.isAnyCharacterInPartyAlive() );
		ICharacter[] deadPlayer = new ICharacter[1];
		deadPlayer[0] = mock(ICharacter.class);
		when(deadPlayer[0].isAlive()).thenReturn(false);
		Party deadParty = new Party(deadPlayer);
		assertFalse( deadParty.isAnyCharacterInPartyAlive() );
	}

	@Test
	public void testAttack() {
		ICharacter mockTarget = mock(ICharacter.class);
		when(mockTarget.isAlive()).thenReturn(true);
		when(mockCharacters[0].isAlive()).thenReturn(true);
		when(mockCharacters[1].isAlive()).thenReturn(true);
		when(mockCharacters[2].isAlive()).thenReturn(true);
		
		when(mockCharacters[0].attack(mockTarget)).thenReturn("0");
		when(mockCharacters[1].attack(mockTarget)).thenReturn("1");
		when(mockCharacters[2].attack(mockTarget)).thenReturn("2");

		assertEquals(party.attack(mockTarget), "0\n1\n2\n");
	}

	@Test
	public void testGetPanel() {
		assertNotNull(party.getPanel());
	}
	
	@Test
	public void testGetRandomAlivePlayer()
	{
		when(mockCharacters[0].isAlive()).thenReturn(true);
		when(mockCharacters[1].isAlive()).thenReturn(true);
		when(mockCharacters[2].isAlive()).thenReturn(true);
		assertTrue( party.getRandomAliveCharacter().isAlive() );
	}
	
	@Test
	public void testGetRandomAlivePlayerReturnsNullWhenNoPlayerIsAlive()
	{
		ICharacter[] deadPlayer = new ICharacter[1];
		deadPlayer[0] = mock(ICharacter.class);
		when(deadPlayer[0].isAlive()).thenReturn(false);
		Party deadParty = new Party(deadPlayer);
		assertNull( deadParty.getRandomAliveCharacter() );
	}
	
	
}
