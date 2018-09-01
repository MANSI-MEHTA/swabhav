package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Student;
import com.techlabs.services.StudentService;

@WebServlet("/editstudent")
public class EditStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditStudentController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("username")==null) {
		
			RequestDispatcher view = request
					.getRequestDispatcher("views/Login.jsp");
			view.forward(request, response);
		
		} else if(session.getAttribute("username")!=null) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			StudentService studentService;
			studentService = StudentService.getInstance();
			Student student = studentService.getStudentById(id);

			request.setAttribute("fname", student.getFname());
			request.setAttribute("lname", student.getLname());
			request.setAttribute("rollno", student.getRollno());
			request.setAttribute("cgpi", student.getCgpi());
			request.setAttribute("clg_id", student.getClg_Id());
			
			RequestDispatcher view = request
					.getRequestDispatcher("views/EditStudent.jsp");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String fname = (String) request.getParameter("fname");
		String lname = (String) request.getParameter("lname");
		// String gender = (String) request.getParameter("gender");
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		int clg_id = Integer.parseInt(request.getParameter("clg_id"));
		double cgpi = Double.parseDouble(request.getParameter("cgpi"));

		StudentService studentservice;
		studentservice = StudentService.getInstance();

		Student student = new Student(fname, lname,clg_id, rollno, cgpi, "male");
		studentservice.updateStudent(student);

		response.sendRedirect("/mvc-student-app/showstudent");
	}

}
