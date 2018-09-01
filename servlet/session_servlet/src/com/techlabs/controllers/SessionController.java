package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionController
 */
@WebServlet("/session")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		String counter=new String("counter");
		Integer val=new Integer(0);

		if(session.getAttribute(counter)==null){
		    session.setAttribute(counter,val);

		}
		val=(Integer)session.getAttribute(counter);
		out.println("<h4>old count is: "+val+"</h4>");
		val=val+1;
		session.setAttribute(counter,val);
		out.println("<h4>new count is: "+val+"</h4>");
		out.println("<h4>session id is: "+session.getId()+"</h4>");
		out.println("<a href='/summary-servlet/summary'>click here for summary</a>");
		    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
