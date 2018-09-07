package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Student;
import com.techlabs.services.StudentService;

public class ShowStudentAction extends ActionSupport implements SessionAware {
	private StudentService studentservice = StudentService.getInstanceOf();
	private List<Student> listOfStudents = new ArrayList<Student>();
	private SessionMap<String,Object> sessionMap;  
	
	@Override
	public String execute() throws Exception {
		
		//System.out.println(sessionMap.get("username"));
	
		listOfStudents = StudentService.getStudents();
		System.out.print(listOfStudents);
		return "success";
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	@Override
	public void setSession(Map<String, Object> session) {
	    sessionMap=(SessionMap)session;  

		
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	

}
