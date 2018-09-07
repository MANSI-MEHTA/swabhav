package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/summary")
public class SummaryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SummaryController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		ServletContext application = getServletContext();

		String counter = new String("counter");
		Integer valueOfSessionCount = (Integer) session.getAttribute(counter);
		Integer valueOfApplicationCount = (Integer) application
				.getAttribute(counter);

		out.println("<h1>Summary </h1>");

		out.println("<h4>Session count is: " + valueOfSessionCount + "</h4>");

		out.println("<h4>Application  count is: " + valueOfApplicationCount
				+ "</h4>");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
