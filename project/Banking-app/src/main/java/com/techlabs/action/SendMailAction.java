package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.EmailService;

public class SendMailAction extends ActionSupport {
	private String from="varshilmehta0196@gmail.com";
	private String password= "varshmehta";
	private String to;
	private String subject="activation of bank app";
	private String body = "click on below link to activate";
	private String email;
	private long account_no;
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());
	private EmailService emailservice=(EmailService) context.getBean("emailservice");
	

	 
	@Override
	public String execute() {
		this.to=getEmail();
		emailservice.sendmail(from, to, password, body, subject,account_no);
		System.out.println("Receiver email id is :"+this.to);
		System.out.println("Account number  is :"+this.account_no);
		
		return "success";
			
	}
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	
	
}
