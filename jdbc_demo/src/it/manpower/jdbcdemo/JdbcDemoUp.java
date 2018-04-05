package it.manpower.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemoUp {
	public static void main(String[] args) throws Exception {
		Class.forName("org.hsqldb.jdbc.JDBCDriver");
		Connection c = DriverManager.getConnection("jdbc:hsqldb:file:D:\\CorsoWorkspace\\jdbc_demo\\demoDB", "sa", "");
		Statement stmnt = c.createStatement();
		ResultSet rs = stmnt.executeQuery("select * from Studenti");
		while (rs.next()) {
			String studente = rs.getString("name") + " " + rs.getString("last name");
			System.out.println(studente);
		}
		stmnt = c.createStatement();
		stmnt.executeUpdate("insert into Studenti(name) values ('Gino')");
		stmnt.close();

		c.close();
	}
}
