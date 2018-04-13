package it.manpower.studentapp.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.manpower.studentapp.dao.StudentDAO;
import it.manpower.studentapp.model.Student;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {

	private Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			conn = DriverManager.getConnection(
					"jdbc:hsqldb:file:/home/jacopo/Scrivania/studentdb", "sa", "");
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			StudentDAO dao = new StudentDAO(conn);
			List<Student> students = dao.findAll();
			req.setAttribute("students", students);
			
			req.getRequestDispatcher("/students.jsp").forward(req, resp);
			
			
		} catch (SQLException e) {
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student stud = new Student();
		stud.setName(req.getParameter("name"));
		stud.setSurname(req.getParameter("surname"));
		stud.setCode(req.getParameter("code"));
		
		StudentDAO dao = new StudentDAO(conn);
		try {
			dao.persist(stud);
		} catch (SQLException e) {
			throw new ServletException(e);
		}
		doGet(req, resp);
	}

	@Override
	public void destroy() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
