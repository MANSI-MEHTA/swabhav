package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Student;
import com.techlabs.services.LoginService;
import com.techlabs.services.StudentService;


@WebServlet("/showstudent")
public class ShowStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowStudentController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StudentService studentservice;
		studentservice=StudentService.getInstance();
		
		LoginService loginservice;
		loginservice=LoginService.getInstance();
		
		boolean loginstate=loginservice.isLoginState();
		request.setAttribute("loginstate", loginstate);
		
		
		List<Student> listOfStudents=studentservice.getStudents();
		request.setAttribute("listOfStudents",listOfStudents);
		
		RequestDispatcher view=request.getRequestDispatcher("views/ShowStudent.jsp");
		view.forward(request,response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
