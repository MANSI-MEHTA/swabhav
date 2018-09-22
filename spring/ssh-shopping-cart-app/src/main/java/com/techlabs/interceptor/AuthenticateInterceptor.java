package com.techlabs.interceptor;

import org.apache.struts2.dispatcher.SessionMap;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthenticateInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		SessionMap<String, Object> sessionmap = (SessionMap<String, Object>) invocation
				.getInvocationContext().getSession();
		System.out.println("coming to interceptor");
		if (sessionmap.get("username") == null) {
			System.out.println("coming to if");
			return "login";
		}

		return invocation.invoke();
	}
}
