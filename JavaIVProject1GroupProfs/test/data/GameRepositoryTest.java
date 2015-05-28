package data;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.*;

import models.AbstractGame;

import org.junit.*;

public class GameRepositoryTest {
	
	private GameRepository gameRepository;
	private Connection mockConnection;
	private String gameName;
	
	@Before
	public void setUp() throws Exception {
		mockConnection = mock(Connection.class);
		gameRepository = new GameRepository(mockConnection);
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
		AbstractGame mockGame = mock(AbstractGame.class);
		when(mockGame.getName()).thenReturn(gameName);
		
		String insert = String.format("insert into \"Game\" ( \"Name\", \"Completed\" ) values ( '%s', false )", gameName);
		
		assertTrue( gameRepository.create(mockGame) );
		
		verify(mockStatement).executeUpdate(insert);	
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
