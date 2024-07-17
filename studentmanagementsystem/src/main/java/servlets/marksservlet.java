package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdb;
import models.marks;
import services.marksservice;
@WebServlet("/addmarks")
public class marksservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pinnumber = req.getParameter("pinnumber");
		int cns = Integer.parseInt(req.getParameter("cns"));
		int bda = Integer.parseInt(req.getParameter("bda"));
		int ml = Integer.parseInt(req.getParameter("ml"));
		int ads = Integer.parseInt(req.getParameter("ads"));
		int swm = Integer.parseInt(req.getParameter("swm"));
		int ipr = Integer.parseInt(req.getParameter("ipr"));
		
		marks m = new marks(pinnumber,cns,bda,ml,ads,swm,ipr);
		
		marksservice service = new marksservice(studentdb.conn());
		boolean f = service.addmarks(m);
		
		if(f) {
			
			resp.sendRedirect("home.jsp");
		}
		else {
			resp.sendRedirect("addmarks.jsp");
		}
	}
}
