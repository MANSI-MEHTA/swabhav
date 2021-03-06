package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.UserTransaction;
import com.techlabs.service.UserTransactionService;
import com.techlabs.viewmodel.DepositVM;

public class ViewTransactionAction extends ActionSupport {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserTransactionService transactionservice = (UserTransactionService) context
			.getBean("transactionservice");
	private DepositVM userbean = new DepositVM();
	private List<UserTransaction> transactions=new ArrayList<UserTransaction>();
	HttpSession session;
	private String username;
	
	@Override
	public String execute() {
		session = ServletActionContext.getRequest().getSession();
		long acc_no = (long) session.getAttribute("acc_no");
		username=(String) session.getAttribute("username");
		System.out
				.println("Account No in View Transaction Action is " + acc_no);
		transactions =transactionservice.getAllTransaction(acc_no);

		return "success";
	}

	public String passbook() {
				return "success";

	}

	public DepositVM getUserbean() {
		return userbean;
	}

	public void setUserbean(DepositVM userbean) {
		this.userbean = userbean;
	}

	public List<UserTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<UserTransaction> transactions) {
		this.transactions = transactions;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}
