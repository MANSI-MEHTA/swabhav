package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Customers;
import com.techlabs.service.CustomerService;

public class RegisterCustomerAction extends ActionSupport implements
		SessionAware {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());
	private SessionMap<String, Object> sessionmap;
	private CustomerService customerservice = (CustomerService) context
			.getBean("customerservice");

	private String name;
	private String address;
	private String username;
	private String password;

	@Override
	public String execute() {
		return "input";
	}
	public String executePost(){
		boolean ispresent=customerservice.checkCustomerExists(username);
		if(ispresent){
			addActionError("Username already exist please try other username");
			return "input";
		}
		else{
			System.out.println(name);
			System.out.println(address);
			System.out.println(username);
			System.out.println(password);
			sessionmap.put("username",username );
			
			customerservice.registerCustomer(new Customers(customerservice.generateUUID(),address,name,username,password));
			return "success";
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionmap = (SessionMap<String, Object>) session;

	}

}
