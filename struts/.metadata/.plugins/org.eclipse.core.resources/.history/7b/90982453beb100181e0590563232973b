package com.techlabs.actions;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.services.LoginService;
import com.techlabs.viewmodel.LoginVM;

public class LoginAction extends ActionSupport implements ServletRequestAware,
		SessionAware, ModelDriven<LoginVM> {
	private HttpServletRequest request;
	private SessionMap<String, Object> sessionMap;
	private LoginService loginservice = new LoginService();
	private LoginVM loginBeam = new LoginVM();

	@Override
	public String execute() throws Exception {
		if (request.getMethod().equals("GET")) {
			System.out.println("coming to login action with get method");
			return "input";
		} else {
			boolean auth = loginservice.authenticate(loginBeam.getUsername(),
					loginBeam.getPassword());
			if (auth) {
				sessionMap.put("username", loginBeam.getUsername());
				System.out.println("coming to login action with post method");
				return "redirect";
				
			} else {
				addActionError("please enter valid credentials");
				return "input";
			}

		}

	}

//	public void validate() {
//		if (loginBeam.getUsername().equals("")) {
//			addFieldError("loginBeam.username", "username is required");
//		}
//		if (loginBeam.getPassword().equals("")) {
//			addFieldError("loginBeam.password", "Password is required");
//		}
//	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.request = req;

	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public LoginService getLoginservice() {
		return loginservice;
	}

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}

	public LoginVM getLoginBeam() {
		return loginBeam;
	}

	public void setLoginBeam(LoginVM loginBeam) {
		this.loginBeam = loginBeam;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap<String, Object>) session;

	}

	@Override
	public LoginVM getModel() {
		return loginBeam;
	}

}
