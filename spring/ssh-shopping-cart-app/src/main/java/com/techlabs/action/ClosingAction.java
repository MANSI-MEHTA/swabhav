package com.techlabs.action;



import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ClosingAction implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("the session is closed");
		
	}

}
