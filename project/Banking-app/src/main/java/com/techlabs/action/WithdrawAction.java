package com.techlabs.action;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Account;
import com.techlabs.entity.User;
import com.techlabs.entity.UserTransaction;
import com.techlabs.service.AccountService;
import com.techlabs.service.UserService;
import com.techlabs.service.UserTransactionService;
import com.techlabs.viewmodel.DepositVM;

public class WithdrawAction extends ActionSupport {
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean("userservice");
	private AccountService accountservice = (AccountService) context
			.getBean("accountservice");
	private UserTransactionService transactionservice = (UserTransactionService) context
			.getBean("transactionservice");
	private DepositVM userbean = new DepositVM();
	HttpSession session;

	@Override
	public String execute() {
		return "success";
	}

	public String withdraw() {
		session = ServletActionContext.getRequest().getSession();
		double amount = userbean.getAmount();
		System.out.println(amount);
		long acc_no = (long) session.getAttribute("acc_no");

		System.out.println("Account No in withdraw Action is " + acc_no);
		Account account = accountservice.getAccountByAcc_no(acc_no);
		User user = userservice.getUserByAcc_no(acc_no);
		System.out.println(account.getAcc_no());

		double oldbalance = account.getBalance();
		if(oldbalance<1000){
			addActionError("You cannot withdraw,Balance is below 1000");
			return "input";
		}
		double newbalance = oldbalance - userbean.getAmount();
		if(newbalance<1000){
			addActionError("you have to maintain minimum balance i.e 1000rs");
			return "input";
		}
		account.setBalance(newbalance);
		account.setUser(user);

		accountservice.updateBalanceByAcc_no(account);

		Date date = new Date();
		long transaction_id = transactionservice.generateTransactionId();

		UserTransaction transaction = new UserTransaction(transaction_id,
				"personal", userbean.getAmount(), "withdraw", date, user);

		transactionservice.printPassbook(transaction);

		return "success";
	}

	public DepositVM getUserbean() {
		return userbean;
	}

	public void setUserbean(DepositVM userbean) {
		this.userbean = userbean;
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}
	
}
