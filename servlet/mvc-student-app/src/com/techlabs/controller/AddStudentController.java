package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.services.StudentService;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/addstudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddStudentController() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("views/form.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		//String gender = (String) request.getParameter("gender");
		String unparseroll = (String) request.getParameter("rollno");
		String unparsecgpi = (String) request.getParameter("cgpi");
		String unparseclg_id = (String) request.getParameter("clg_id");
		

		StudentService studentservice;
		studentservice = StudentService.getInstance();

		
		if (fname.equals("") || lname.equals("") || unparseroll.equals("")
				|| unparsecgpi.equals("") ) {
			
			request.setAttribute("fname",fname );
			request.setAttribute("lname",lname );
			request.setAttribute("unparseroll",unparseroll );
			request.setAttribute("unparsecgpi",unparsecgpi );
			request.setAttribute("unparseclg_id",unparseclg_id );
			
			
			RequestDispatcher view = request
					.getRequestDispatcher("views/form.jsp?error=All fields are required");
			view.forward(request, response);

		} else {
			int rollno = Integer.parseInt(request.getParameter("rollno"));
			int clg_id = Integer.parseInt(request.getParameter("clg_id"));
			double cgpi = Double.parseDouble(request.getParameter("cgpi"));

			Student student = new Student(fname, lname,clg_id, rollno, cgpi,"male");
			studentservice.addStudent(student);
			
			response.sendRedirect("/mvc-student-app/showstudent");
		}
	}

}
