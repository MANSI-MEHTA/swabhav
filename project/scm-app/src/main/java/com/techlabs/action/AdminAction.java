package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Company;
import com.techlabs.entity.Partner;
import com.techlabs.entity.Subscription;
import com.techlabs.entity.Tenant;
import com.techlabs.service.CompanyService;
import com.techlabs.service.ModuleService;
import com.techlabs.service.PartnerService;
import com.techlabs.service.SubscriptionService;
import com.techlabs.service.SupportService;
import com.techlabs.service.TenantService;

public class AdminAction extends ActionSupport {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private CompanyService companyservice = (CompanyService) context
			.getBean("companyservice");
	private SubscriptionService subscriptionservice = (SubscriptionService) context
			.getBean("subscriptionservice");

	private TenantService tenantservice = (TenantService) context
			.getBean("tenantservice");

	private PartnerService partnerservice = (PartnerService) context
			.getBean("partnerservice");

	private String username;
	private String password;
	private boolean authstatus;

	@Override
	public String execute() {
		System.out.println("coming to execute method");
		Company admin = companyservice.authenticateAdmin(username, password);
		if (admin != null) {
			authstatus = true;
		} else {
			authstatus = false;
		}
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAuthstatus() {
		return authstatus;
	}

	public void setAuthstatus(boolean authstatus) {
		this.authstatus = authstatus;
	}

}
