package com.techlabs.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Partner;
import com.techlabs.entity.Subscription;
import com.techlabs.entity.Tenant;
import com.techlabs.service.SubscriptionService;

public class AdminViewAction extends ActionSupport {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private SubscriptionService subscriptionservice = (SubscriptionService) context
			.getBean("subscriptionservice");

	
	private List<Subscription> subscriptions;

	@Override
	public String execute() {
		System.out.println("\n\ncoming to view Subscription action");
		subscriptions = subscriptionservice.getAllSubscriptions();
		//tenants = tenantservice.getAllTenants();
		//partners = partnerservice.getAllPartners();
		return "success";


	}

		public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	

}
