package com.teclabs.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.service.CollegeService;

@WebServlet("/showstudentsincollege")
public class ShowStudentsInCollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowStudentsInCollegeController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		CollegeService collegeservice = CollegeService.getInstanceOf();

		List<Student> listOfStudentsByCollegId = collegeservice
				.getStudentsByCollegeId(id);
		request.setAttribute("listOfStudentsByCollegId", listOfStudentsByCollegId);
		RequestDispatcher view=request.getRequestDispatcher("views/ShowStudentInCollege.jsp");
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
