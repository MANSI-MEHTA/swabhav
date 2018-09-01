package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.College;
import com.techlabs.services.CollegeService;

@WebServlet("/showcollege")
public class ShowCollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowCollegeController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int clg_id=Integer.parseInt(request.getParameter("id"));
		
		CollegeService collegeservice;
		collegeservice=CollegeService.getInstanceOf();
		
		College college=collegeservice.getCollegeById(clg_id);
		request.setAttribute("clg_id",college.getClg_ID());
		request.setAttribute("clg_name",college.getClg_Name());
		request.setAttribute("location",college.getLocation());
		RequestDispatcher view=request.getRequestDispatcher("views/ShowCollege.jsp");
		view.forward(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
