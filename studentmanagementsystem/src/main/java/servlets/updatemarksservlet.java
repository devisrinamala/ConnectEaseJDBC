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

@WebServlet("/updatemarks")
public class updatemarksservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int cns = Integer.parseInt(req.getParameter("cns"));
		int bda =  Integer.parseInt(req.getParameter("bda"));
		int ml = Integer.parseInt(req.getParameter("ml"));
		int ads = Integer.parseInt(req.getParameter("ads"));
		int swm = Integer.parseInt(req.getParameter("swm"));
		int ipr = Integer.parseInt(req.getParameter("ipr"));
		String pinnumber = req.getParameter("pinnumber");
		marks mar = new marks(pinnumber,cns,bda,ml,ads,swm,ipr);
		marksservice service1= new marksservice(studentdb.conn());
		boolean f = service1.updatemarks(mar);
		
		if(f) {
			resp.sendRedirect("allmarks.jsp");
		}
		else {
			resp.sendRedirect("error.jsp");
		}
		
	}
}
