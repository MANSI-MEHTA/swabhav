package com.teclabs.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.LoginService;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		LoginService loginservice;
		loginservice = LoginService.getInstance();

		boolean loginstate = loginservice.authenticateUser(username, password);
		if (loginstate) {
			session.setAttribute("username", username);
			loginservice.setLoginState(loginstate);
			response.sendRedirect("/mvc-student-db-app/showstudent");
		} else {
			RequestDispatcher view = request
					.getRequestDispatcher("views/Login.jsp?error=Please Enter Valid Credentials");
			view.forward(request, response);
		}

	}

}
