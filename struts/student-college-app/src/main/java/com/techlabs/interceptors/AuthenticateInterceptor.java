	package com.techlabs.interceptors;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthenticateInterceptor extends AbstractInterceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private SessionMap<String, Object> sessionMap;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		SessionMap<String, Object> sessionMap = (SessionMap<String, Object>) invocation
				.getInvocationContext().getSession();
//		if (sessionMap == null) {
//			return "login";
//
		 if (sessionMap.get("username") == null) {

			System.out.println("working");
			return "login";
		} else {
			System.out.println("method returns "+invocation.invoke());
			return invocation.invoke();

		}
		
		
	}

}
