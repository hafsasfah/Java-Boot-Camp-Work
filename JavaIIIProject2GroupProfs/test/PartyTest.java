import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class PartyTest {

	private Party party;
	private iCharacter[] mockCharacters;
	
	@Before
	public void setUp() throws Exception {
		mockCharacters = new iCharacter[3];
		mockCharacters[0] = mock(iCharacter.class);
		mockCharacters[1] = mock(iCharacter.class);
		mockCharacters[2] = mock(iCharacter.class);
		
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
		iCharacter[] deadPlayer = new iCharacter[1];
		deadPlayer[0] = mock(iCharacter.class);
		when(deadPlayer[0].isAlive()).thenReturn(false);
		Party deadParty = new Party(deadPlayer);
		assertFalse( deadParty.isAnyCharacterInPartyAlive() );
	}

	@Test
	public void testAttack() {
		iCharacter mockTarget = mock(iCharacter.class);
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

}
