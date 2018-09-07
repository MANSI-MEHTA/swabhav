package com.techlabs.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("App Context is created");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("App Context is Destroyed");
		
	}

}
