package it.manpower.studentapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.manpower.studentapp.model.Student;

public class StudentDAO {
	private Connection conn;

	public StudentDAO(Connection conn) {
		this.conn = conn;
	}

	public List<Student> findAll() throws SQLException {
		List<Student> result = new ArrayList<>();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from students");
		while (rs.next()) {
			Student stud = new Student();
			stud.setName(rs.getString("NAME"));
			stud.setSurname(rs.getString("SURNAME"));
			stud.setCode(rs.getString("CODE"));
			result.add(stud);
		}
		rs.close();
		stmt.close();
		return result;
	}
	
	public void persist(Student s) throws SQLException {
		PreparedStatement stmt = conn.prepareStatement(
				"insert into STUDENTS (NAME, SURNAME, CODE) values (?,?,?)");
		stmt.setString(1, s.getName());
		stmt.setString(2, s.getSurname());
		stmt.setString(3, s.getCode());
		stmt.executeUpdate();
		stmt.close();
	}
}
