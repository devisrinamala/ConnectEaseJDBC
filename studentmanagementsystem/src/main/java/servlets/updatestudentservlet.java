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
@WebServlet("/update")
public class updatestudentservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pin = req.getParameter("pinnumber");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String branch = req.getParameter("branch");
		student st = new student(pin, name, email, branch);
		studentservice service = new studentservice(studentdb.conn());
		boolean f = service.updatestu(st);
		if(f) {
			
			System.out.println("updated successfully");
			
			resp.sendRedirect("allstudents.jsp");
		}
		else {
			
			System.out.println("invalid operation");
			
			resp.sendRedirect("error.jsp");
		}
	}
}
