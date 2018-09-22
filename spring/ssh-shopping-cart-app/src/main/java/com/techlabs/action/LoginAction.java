package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.service.CustomerService;

public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private SessionMap<String, Object> sessionmap;
	private WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private CustomerService customerservice = (CustomerService) context
			.getBean("customerservice");

	@Override
	public String execute() {

		return "input";
	}

	public String executePost() {
		System.out.println(username);
		System.out.println(password);
		boolean auth = customerservice.authenticateCustomer(username, password);
		if (auth) {
			sessionmap.put("username", username);

			return "success";
		} else {
			addActionError("please enter valid credentials");
			return "input";
		}

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

	public CustomerService getCustomerservice() {
		return customerservice;
	}

	public void setCustomerservice(CustomerService customerservice) {
		this.customerservice = customerservice;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionmap = (SessionMap<String, Object>) session;

	}

}
