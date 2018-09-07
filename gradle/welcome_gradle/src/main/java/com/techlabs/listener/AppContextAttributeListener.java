package com.techlabs.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class AppContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Added Name is "+event.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Removed Name is "+event.getValue());
		
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		
		
	}

}
