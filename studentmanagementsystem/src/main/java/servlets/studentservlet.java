package servlets; 

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdb;
import models.student;
import services.studentservice;
@WebServlet("/register")

public class studentservlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pin = req.getParameter("PIN");
		String name = req.getParameter("NAME");
		String email = req.getParameter("EMAIL");
		String branch = req.getParameter("BRANCH");
		student st = new student(pin,name,email,branch);
		studentservice service = new studentservice(studentdb.conn());
		boolean f = service.addstudent(st);
		if(f) {
			resp.sendRedirect("welcome.jsp");	
		}
		else {
			resp.sendRedirect("error.jsp");
		}
	}

}
