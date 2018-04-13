package it.manpower.jdbc.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PazienteDaoTest {

	private Connection connection;
	private PazienteDao dao;
	
	@BeforeClass
	public static void setUpClass() {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Before
	public void setUp() throws SQLException {
		connection = DriverManager.getConnection("jdbc:hsqldb:mem:testdb", "sa", "");
		dao = new PazienteDao(connection);
		
		Statement statement = connection.createStatement();
		statement.executeQuery("CREATE TABLE PUBLIC.PAZIENTI (ID INTEGER, NOME VARCHAR(100), COGNOME VARCHAR(100), CF VARCHAR(100))");
		statement.executeQuery("INSERT INTO PAZIENTI(ID, NOME, COGNOME, CF) VALUES (1, 'Luca', 'Bianchi', 'aaa')");
		statement.executeQuery("INSERT INTO PAZIENTI(ID, NOME, COGNOME, CF) VALUES (2, 'Mario', 'Rossi', 'bbb')");
		statement.close();
	}
	
	@After
	public void tearDown() throws SQLException {
		Statement statement = connection.createStatement();
		statement.executeUpdate("DROP TABLE PUBLIC.PAZIENTI");
		connection.close();
	}
	
	@Test
	public void testFindAll() throws SQLException {
		// chiamo il metodo findAll del dao
		List<Paziente> result = dao.findAll();
		// asserisco che l'esecuzione sia andata come mi aspettavo
		assertFalse(result.isEmpty());
		assertEquals("Luca", result.get(0).getNome());
		assertEquals("Bianchi", result.get(0).getCognome());
	}
	
	@Test
	public void testCount() throws SQLException {
		assertEquals(2, dao.Count());
	}
	
	
}
