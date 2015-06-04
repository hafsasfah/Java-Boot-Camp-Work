import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.*;
import models.aGame;
import org.junit.*;
import data.GameRepository;

public class GameRepoTest {
	
	private GameRepository gameRepository;
	private Connection mockConnection;
	private String gameName;
	
	@Before
	public void setUp() throws Exception {
		mockConnection = mock(Connection.class);
		gameRepository = new GameRepository();
		gameName = "MockGame";
	}

	@Test
	public void testGameRepository() {
		assertNotNull( gameRepository );
	}

	@Test
	public void testCreate() throws SQLException {
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		aGame mockGame = mock(aGame.class);
		when(mockGame.getName()).thenReturn(gameName);
		
		String insert = String.format("insert into \"Game\" ( \"Name\", \"Completed\" ) values ( '%s', false )", gameName);
		
		assertTrue( gameRepository.create(mockGame) );
		
		verify(mockStatement).executeUpdate(insert);	
	}
	
	@Test
	public void testCreateStatementThrowsException() throws SQLException {
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		aGame mockGame = mock(aGame.class);
		when(mockGame.getName()).thenReturn(gameName);
		when(mockStatement.executeUpdate(anyString())).thenThrow( new SQLException() );
		
		assertFalse( gameRepository.create(mockGame) );	
	}

	@Test
	public void testGetGameID() throws SQLException {
		int gameID = 42;
		
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		
		String query = String.format("select \"ID\" from \"Game\" where \"Name\" = '%s'", gameName );
		
		ResultSet mockResultSet = mock(ResultSet.class);
		when(mockResultSet.next()).thenReturn(true);
		when(mockResultSet.getInt(1)).thenReturn(gameID);
		when(mockStatement.executeQuery(query)).thenReturn(mockResultSet);
		
		assertEquals( gameID, gameRepository.getGameID(gameName) );
		
		verify(mockStatement).executeQuery(query);
		
	}

}