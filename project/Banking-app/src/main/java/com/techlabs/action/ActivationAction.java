package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;

public class ActivationAction extends ActionSupport {

	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean("userservice");

	@Override
	public String execute() {

		long acc_no = Long.parseLong(ServletActionContext.getRequest()
				.getParameter("acc_no"));
		User user = userservice.getUserByAcc_no(acc_no);

		user.setState("activate");
		userservice.changeToActivateState(user);
		User updateduser = userservice.getUserByAcc_no(acc_no);
		System.out.println("state is :" + updateduser.getState());

		return "success";
	}
}
