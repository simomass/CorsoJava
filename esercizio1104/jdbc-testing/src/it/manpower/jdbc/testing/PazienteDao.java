package it.manpower.jdbc.testing;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PazienteDao {

	private Connection connection;
	
	public PazienteDao(Connection connection) {
		this.connection = connection;
	}
	
	public List<Paziente> findAll() throws SQLException {
		List<Paziente> pazienti = new LinkedList<>();
		Statement mnt = connection.createStatement();
		ResultSet boh = mnt.executeQuery("SELECT * FROM PAZIENTI");
		while(boh.next()) {
			pazienti.add(new Paziente(boh.getString("NOME"), boh.getString("COGNOME"),boh.getString("CF")));
		}
		
		return pazienti;
	}
	
	public int Count() throws SQLException {
		Statement mnt = connection.createStatement();
		ResultSet boh = mnt.executeQuery("SELECT COUNT(*) AS TOT FROM PAZIENTI");
		boh.next();
		return boh.getInt("TOT");
	}
	
	
}
