package com.teclabs.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.College;
import com.techlabs.service.CollegeService;

@WebServlet("/showcolleges")
public class ShowCollegesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowCollegesController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CollegeService collegeservice;
		collegeservice=CollegeService.getInstanceOf();
		List<College> listOfColleges=collegeservice.getColleges();
		request.setAttribute("listOfColleges", listOfColleges);
		
		RequestDispatcher view=request.getRequestDispatcher("views/ShowColleges.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
