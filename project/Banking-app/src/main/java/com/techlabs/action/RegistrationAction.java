package com.techlabs.action;

import javax.crypto.SecretKey;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Account;
import com.techlabs.entity.User;
import com.techlabs.service.AccountService;
import com.techlabs.service.UserService;
import com.techlabs.viewmodel.RegistrationVM;

public class RegistrationAction extends ActionSupport implements
		ModelDriven<RegistrationVM> {
	private RegistrationVM userbean = new RegistrationVM();
	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean("userservice");

	private AccountService accountservice = (AccountService) context
			.getBean("accountservice");

	private String email;
	private long account_no;

	@Override
	public String execute() {
		return "success";

	}

	public String registerUser() throws Exception {

		System.out.println(userbean.getEmail());
		System.out.println(userbean.getDob());
		if (userbean.getEmail() == "") {
			addActionError("please enter valid email id ");
			return "input";

		}

		boolean ispresent = userservice.checkUserExists(userbean.getEmail());
		if (ispresent) {
			addActionError("You are already registered,login instead ");
			return "input";

		} else {
			email = userbean.getEmail();
			long acc_no = accountservice.generateAccountNumber();
			this.account_no = acc_no;
			System.out.println("Account number is" + acc_no);
			Account newaccount = new Account(acc_no, 0);
			System.out.println("new Account is" + newaccount);
			accountservice.CreateAccount(newaccount);
			SecretKey secKey = userservice.getSecretEncryptionKey();
			String username = userservice.bytesToHex(userservice.encryptText(
					userbean.getUsername(), secKey));
			String password = userservice.bytesToHex(userservice.encryptText(
					userbean.getPassword(), secKey));
			User newuser = new User(userbean.getFname(), userbean.getLname(),
					userbean.getEmail(), userbean.getContact(),
					userbean.getDob(), userbean.getAddress(), username,
					password, "unactivated", newaccount);
			userservice.registerUser(newuser);

		}
		return "success";

	}

	public void validate() {
		// if (userbean.getFname() == null) {
		// addFieldError("userbean.fname", "firstname is required");
		//
		// }
		// if (userbean.getLname() == null) {
		// addFieldError("userbean.lname", "lastname is required");
		// }
		//
		// if (userbean.getEmail() == null) {
		// addFieldError("userbean.email", "email id is required");
		// }
		// if (String.valueOf(userbean.getContact()).length() < 9) {
		// addFieldError("usernbean.contact", "contact is required");
		// }
		// if (userbean.getAddress() == null) {
		// addFieldError("userbean.address", "Address is required");
		// }
		// if (userbean.getUsername() == null) {
		// addFieldError("userbean.username", "username is required");
		// }
		// if (userbean.getPassword() == null) {
		// addFieldError("userbean.password", "password is required");
		// }
		// if (userbean.getDob() == null) {
		// addFieldError("userbean.date", "Date is required");
		// }

	}

	@Override
	public RegistrationVM getModel() {

		return userbean;
	}

	public RegistrationVM getUserbean() {
		return userbean;
	}

	public void setUserbean(RegistrationVM userbean) {
		this.userbean = userbean;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

}
