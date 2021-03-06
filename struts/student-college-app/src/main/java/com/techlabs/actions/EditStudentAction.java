package com.techlabs.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.services.StudentService;
import com.techlabs.viewmodel.EditStudentVM;

public class EditStudentAction extends ActionSupport implements
		ModelDriven<EditStudentVM>, ServletRequestAware, SessionAware {
	private int id = 0;
	private String postback = "GET";
	StudentService studentservice = StudentService.getInstanceOf();
	EditStudentVM studentBeam = new EditStudentVM();
	private SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Selected id is" + id + "\n");
		 Student student = studentservice.getStudentById(id);
		 studentBeam.setRollno(student.getRollno());
		 studentBeam.setLname(student.getLname());
		 studentBeam.setFname(student.getFname());
		 studentBeam.setClg_id(student.getClg_id());
		 studentBeam.setCgpi(student.getCgpi());
		 studentBeam.setGender(student.getGender());
		 System.out.println(id);
		 System.out.println(studentBeam.getFname());
		return "input";
	}

	public String executePost() throws Exception {
		System.out.println(studentBeam.getFname());
		studentservice.updateStudentById(new Student(studentBeam.getRollno(),
				studentBeam.getFname(), studentBeam.getLname(), studentBeam
						.getClg_id(), studentBeam.getCgpi(), studentBeam
						.getGender()));
		return "redirect";

	}

	@Override
	public EditStudentVM getModel() {
		return studentBeam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostback() {
		return postback;
	}

	public void setPostback(String postback) {
		this.postback = postback;
	}

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	public EditStudentVM getStudentBeam() {
		return studentBeam;
	}

	public void setStudentBeam(EditStudentVM studentBeam) {
		this.studentBeam = studentBeam;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;

	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// if(request.getMethod().equalsIgnoreCase("get")){
		System.out.println("\n\ninside get method ");
		// }

	}

}
