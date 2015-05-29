

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.*;
import models.aPlayers;
import org.junit.*;
import data.PlayerRepository;

public class PlayerRepoTest {
	
	private PlayerRepository playerRepository;
	private Connection mockConnection;
	private String playerName;
	
	@Before
	public void setUp() throws Exception {
		mockConnection = mock(Connection.class);
		playerRepository = new PlayerRepository();
		playerName = "MockPlayer";
	}

	@Test
	public void testPlayerRepository() {
		assertNotNull( playerRepository );
	}

	@Test
	public void testCreate() throws SQLException {
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		aPlayers mockPlayer = mock(aPlayers.class);
		when(mockPlayer.getName()).thenReturn(playerName);
		
		String insert = String.format("insert into \"Game\" ( \"Name\" ) values ( '%s' )", playerName);
		
		assertTrue( playerRepository.create(mockPlayer) );
		
		verify(mockStatement).executeUpdate(insert);	
	}
	
	@Test
	public void testCreateStatementThrowsException() throws SQLException {
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		aPlayers mockPlayer = mock(aPlayers.class);
		when(mockPlayer.getName()).thenReturn(playerName);
		when(mockStatement.executeUpdate(anyString())).thenThrow( new SQLException() );
		
		assertFalse( playerRepository.create(mockPlayer) );	
	}	
}