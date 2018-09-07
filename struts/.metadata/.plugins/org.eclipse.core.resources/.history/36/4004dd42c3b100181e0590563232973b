package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Student;
import com.techlabs.services.StudentService;
import com.techlabs.viewmodel.AddStudentVM;

public class AddStudentAction extends ActionSupport implements
		ModelDriven<AddStudentVM> {
	private String methodtype = "GET";
	private StudentService studentservice = StudentService.getInstanceOf();
	AddStudentVM studentBeam = new AddStudentVM();

	@Override
	public String execute() throws Exception {
		if (methodtype.equals("GET")) {
			return "input";
		} else {
			studentservice.addStudent(new Student(studentBeam.getRollno(), studentBeam
					.getFname(), studentBeam.getLname(), studentBeam.getCgpi(), studentBeam
					.getGender()));
			return "redirect";
		}

	}

	public void validate() {

		if (studentBeam.getRollno()>0) {
			addFieldError("student.fname", "First name is mandatory");
			setMethodtype("GET");
		}
		
		if (studentBeam.getFname() == "") {
			addFieldError("student.fname", "First name is mandatory");
			setMethodtype("GET");
		}
		if (studentBeam.getLname() == "") {
			addFieldError("student.lname", "Last name is mandatory");
			setMethodtype("GET");
		}
		if ((studentBeam.getCgpi()<1.0 && studentBeam.getCgpi()>10.0)) {
			addFieldError("cgpi", "cgpi is mandatory");
			setMethodtype("GET");
		}
	}

	@Override
	public AddStudentVM getModel() {
		return studentBeam;
	}

	public String getMethodtype() {
		return methodtype;
	}

	public void setMethodtype(String methodtype) {
		this.methodtype = methodtype;
	}

	public StudentService getStudentservice() {
		return studentservice;
	}

	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	public AddStudentVM getStudentBeam() {
		return studentBeam;
	}

	public void setStudentBeam(AddStudentVM studentBeam) {
		this.studentBeam = studentBeam;
	}

	
}
