package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class LockAction extends ActionSupport {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean("userservice");

	@Override
	public String execute() {
		long acc_no = Long.parseLong(ServletActionContext.getRequest()
				.getParameter("id"));
		System.out.println("account no in lock action is " + acc_no);
		User user=userservice.getUserByAcc_no(acc_no);
		user.setState("locked");
		userservice.changeToLockedState(user);
		return "success";
	}

}
