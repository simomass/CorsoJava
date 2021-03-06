package it.manpower.esame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	private static final String DB_CONNECTION_URI = "jdbc:hsqldb:file:db/esame";

	public static void main(String[] args) throws SQLException {
		loadDriver();

		Connection connection = DriverManager.getConnection(DB_CONNECTION_URI);
		ClienteDao dao = new ClienteDao(connection);

		for(Cliente c : dao.findAll()) {
			System.out.println(c.getNome()+ " "+ c.getCognome()+ " "+c.getCf() +"\n");
		}
		
		System.out.print("Ci sono "+dao.Count()+ " record nella tabella Clienti"+"\n");
		
		
		
		PrenotazioneDao daoPreno = new PrenotazioneDao(connection);
		
		for (Prenotazione p : daoPreno.findByCliente(1)) {
			System.out.println(p.getId_auto());
			System.out.println(p.getId_cliente());
			System.out.println(p.getFrom());
			System.out.println(p.getTo());
		}
		
		connection.close();
	}

	private static void loadDriver() {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
