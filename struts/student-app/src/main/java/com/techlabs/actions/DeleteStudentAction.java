package com.techlabs.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Student;
import com.techlabs.services.StudentService;

public class DeleteStudentAction extends ActionSupport implements
		ServletRequestAware,SessionAware {
	private int id = 0;
	private StudentService studentservice = StudentService.getInstanceOf();
	private SessionMap<String,Object> sessionMap;
	@Override
	public String execute() throws Exception {
		if(sessionMap.get("username")==null){
			return "login";
		}
		Student student=studentservice.getStudentById(id);
		studentservice.deleteStudent(student);
		return "redirect";
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		if (request.getMethod().equals("GET")) {
			id = Integer.parseInt(request.getParameter("id"));
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap<String,Object>)session;
		
	}

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}
	

}
