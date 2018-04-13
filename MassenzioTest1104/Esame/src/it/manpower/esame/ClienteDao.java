package it.manpower.esame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ClienteDao {
	private Connection connection;

	public ClienteDao(Connection connection) {
		this.connection = connection;
	}

	public List<Cliente> findAll() throws SQLException {
		List<Cliente> clienti = new LinkedList<>();
		Statement stmn = connection.createStatement();
		ResultSet result = stmn.executeQuery("SELECT * FROM CLIENTI");
		while (result.next()) {
			clienti.add(new Cliente(result.getInt("id"), result.getString("nome"), result.getString("Cognome"),
					result.getString("cf")));
		}
		stmn.close();
		return clienti;
	}

	
	public int Count() throws SQLException {
		Statement stmn = connection.createStatement();
		ResultSet result = stmn.executeQuery("SELECT COUNT(*) AS TOT FROM CLIENTI");
		result.next();
		stmn.close();
		return result.getInt("TOT");
	}

	public void add(Cliente c) throws SQLException {
		PreparedStatement mnt = connection
				.prepareStatement("INSERT INTO CLIENTI(ID, NOME, COGNOME, CF)" + "values(?,?,?,?)");
		mnt.setInt(1, c.getId());
		mnt.setString(2, c.getNome());
		mnt.setString(3, c.getCognome());
		mnt.setString(4, c.getCf());
	}
}
