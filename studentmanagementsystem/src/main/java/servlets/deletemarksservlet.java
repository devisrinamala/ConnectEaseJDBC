package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdb;
import services.marksservice;

@WebServlet("/deletemark")
public class deletemarksservlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pinnumber = req.getParameter("pinnumber");
		marksservice service = new marksservice(studentdb.conn());
		boolean f = service.deletemarks(pinnumber);
		
		if(f) {
			
			resp.sendRedirect("allmarks.jsp");
		}
		else {
			resp.sendRedirect("addmarks.jsp");
		}
	}
}
