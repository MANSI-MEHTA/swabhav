package com.techlabs.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/beerselect")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BeerSelect() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color=request.getParameter("color");
		
		BeerExpert expert=new BeerExpert();
		
		List result=expert.getBrands(color);
		
		request.setAttribute("styles",result);
		RequestDispatcher view=request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
	}

}
