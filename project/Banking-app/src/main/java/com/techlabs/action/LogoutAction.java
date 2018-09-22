package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> sessionmap;

	@Override
	public String execute() {
		sessionmap.put("username", null);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionmap = (SessionMap<String, Object>) session;

	}

	public SessionMap<String, Object> getSessionmap() {
		return sessionmap;
	}

	public void setSessionmap(SessionMap<String, Object> sessionmap) {
		this.sessionmap = sessionmap;
	}
	

}
