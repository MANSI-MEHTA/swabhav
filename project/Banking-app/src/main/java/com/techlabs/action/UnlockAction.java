package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class UnlockAction extends ActionSupport {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean("userservice");

	@Override
	public String execute() {
		long acc_no = Long.parseLong(ServletActionContext.getRequest()
				.getParameter("id"));
		System.out.println("account no in unlock action is " + acc_no);
		User user = userservice.getUserByAcc_no(acc_no);
		user.setState("activate");
		userservice.changeToActivateState(user);
		return "success";
	}

}
