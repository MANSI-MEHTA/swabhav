package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class RegistrationAction extends ActionSupport implements SessionAware {
	private String username;
	private String password;
	private SessionMap<String, Object> sessionmap;
	private WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean(UserService.class);

	@Override
	public String execute() {
		System.out.println(username);
		System.out.println(password);
		boolean auth = userservice.checkUserExists(username);
		if (auth) {
			addActionError("username already exists.try some other");
			return "input";

		} else {
			userservice.registerUser(new User(username, password));
			sessionmap.put("username", username);
			return "success";

		}

	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionmap = (SessionMap<String, Object>) session;

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

	public SessionMap<String, Object> getSessionmap() {
		return sessionmap;
	}

	public void setSessionmap(SessionMap<String, Object> sessionmap) {
		this.sessionmap = sessionmap;
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

}