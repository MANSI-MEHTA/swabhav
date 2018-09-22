package com.techlabs.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Account;
import com.techlabs.entity.User;
import com.techlabs.entity.UserTransaction;
import com.techlabs.service.AccountService;
import com.techlabs.service.UserService;
import com.techlabs.service.UserTransactionService;
import com.techlabs.viewmodel.DepositVM;

public class DepositAction extends ActivationAction implements
		ModelDriven<DepositVM> {
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

	public String deposit() {
		session = ServletActionContext.getRequest().getSession();
		double amount = userbean.getAmount();
		long acc_no = (long) session.getAttribute("acc_no");	

		System.out.println("Account No in deposit Action is " + acc_no);
		Account account = accountservice.getAccountByAcc_no(acc_no);
		User user = userservice.getUserByAcc_no(acc_no);
		System.out.println(account.getAcc_no());

		double oldbalance = account.getBalance();
		double newbalance = oldbalance + userbean.getAmount();
		account.setBalance(newbalance);
		account.setUser(user);

		accountservice.updateBalanceByAcc_no(account);

		Date date = new Date();
		long transaction_id = transactionservice.generateTransactionId();

		UserTransaction transaction = new UserTransaction(transaction_id,
				"personal", userbean.getAmount(), "deposit", date, user);
		
		transactionservice.printPassbook(transaction);
		
		return "success";
	}

	@Override
	public DepositVM getModel() {

		return userbean;

	}

	public DepositVM getUserbean() {
		return userbean;
	}

	public void setUserbean(DepositVM userbean) {
		this.userbean = userbean;
	}

}
