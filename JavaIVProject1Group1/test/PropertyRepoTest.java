import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.sql.*;
import models.aProperty;
import org.junit.*;
import data.PropertyRepository;

public class PropertyRepoTest {
	
	private PropertyRepository propertyRepository;
	private Connection mockConnection;
	private String propertyName;
	
	@Before
	public void setUp() throws Exception {
		mockConnection = mock(Connection.class);
		propertyRepository = new PropertyRepository();
		propertyName = "MockProperty";
	}

	@Test
	public void testPropertyRepository() {
		assertNotNull( propertyRepository );
	}

	@Test
	public void testCreate() throws SQLException {
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		aProperty mockProperty = mock(aProperty.class);
		when(mockProperty.getName()).thenReturn(propertyName);
		
		String insert = String.format("insert into \"Game\" ( \"Name\" ) values ( '%s' )", propertyName);
		
		assertTrue( propertyRepository.create(mockProperty) );
		
		verify(mockStatement).executeUpdate(insert);	
	}
	
	@Test
	public void testCreateStatementThrowsException() throws SQLException {
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		aProperty mockProperty = mock(aProperty.class);
		when(mockProperty.getName()).thenReturn(propertyName);
		when(mockStatement.executeUpdate(anyString())).thenThrow( new SQLException() );
		
		assertFalse( propertyRepository.create(mockProperty) );	
	}

	@Test
	public void testGetPropertyID() throws SQLException {
		int propertyID = 42;
		
		Statement mockStatement = mock(Statement.class);
		when(mockConnection.createStatement()).thenReturn(mockStatement);
		
		String query = String.format("select \"ID\" from \"Property\" where \"Name\" = '%s'", propertyName );
		
		ResultSet mockResultSet = mock(ResultSet.class);
		when(mockResultSet.next()).thenReturn(true);
		when(mockResultSet.getInt(1)).thenReturn(propertyID);
		when(mockStatement.executeQuery(query)).thenReturn(mockResultSet);
		
		assertEquals( propertyID, propertyRepository.getPropertyID(propertyName) );
		
		verify(mockStatement).executeQuery(query);
		
	}

}