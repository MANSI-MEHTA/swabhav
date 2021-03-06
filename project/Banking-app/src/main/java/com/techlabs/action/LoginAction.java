package com.techlabs.action;

import javax.crypto.SecretKey;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.User;
import com.techlabs.service.UserService;
import com.techlabs.viewmodel.LoginVM;

public class LoginAction extends ActionSupport implements ModelDriven<LoginVM> {
	private LoginVM userbean = new LoginVM();

	WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());

	private UserService userservice = (UserService) context
			.getBean("userservice");

	private HttpSession session;

	@Override
	public String execute() {
		return "login";
	}

	public String authenticateUser() throws Exception {
		SecretKey secKey = userservice.getSecretEncryptionKey();
		String username = userservice.bytesToHex(userservice.encryptText(
				userbean.getUsername(), secKey));
		String password = userservice.bytesToHex(userservice.encryptText(
				userbean.getPassword(), secKey));

		User user = userservice.authenticateUser(username, password);
		System.out.println("logged in User is" + user);

		if (user != null) {
			if (user.getState().equalsIgnoreCase("activate")) {

				session = ServletActionContext.getRequest().getSession();
				System.out.println("session is initailized");
				session.setAttribute("username", userbean.getUsername());
				System.out.println(user.getUser_id());
				session.setAttribute("acc_no", user.getUser_id());

				boolean isAdmin = checkUserIsAdmin(user);
				if (isAdmin) {
					return "admin";
				}
				return "success";
			} else {
				addActionError("Please activate your account by clicking on link sent to registered Email-ID");
				return "input";
			}
		} else {
			session = ServletActionContext.getRequest().getSession();
			User user1 = userservice.getUserByUserName(username);
			System.out.println("User trying to make attempts is "+user1);
			if (user1 != null) {
				incrementAttempts(session);
				boolean isattemptexceeded = checkUserAttempts(session);
				if (isattemptexceeded) {
					user1.setState("locked");
					userservice.changeToLockedState(user1);
					addActionError("you are temporarily locked,please visit bank for further verification");
					return "input";
				}
				addActionError("Your password is incorrect ");
				return "input";
			}
			addActionError("Please enter valid credentials");
			return "input";
		}

		// byte[] cipherText = userservice.encryptText(userbean.getUsername(),
		// secKey);

		// String decryptedText = userservice.decryptText(cipherText, secKey);

		// System.out.println("AES Key (Hex Form):");
		// String str=UserService.bytesToHex(secKey.getEncoded());
		// System.out.println(str);
		// System.out.println("Encrypted Text (Hex Form):"
		// + userservice.bytesToHex(cipherText));
		// System.out.println("Descrypted Text:" + decryptedText);

	}

	private void incrementAttempts(HttpSession session) {
		if (session.getAttribute("attempts") == null) {
			int attempt = 1;
			session.setAttribute("attempts", attempt);

		} else {
			int attempt = (int) session.getAttribute("attempts");
			attempt += 1;
			session.setAttribute("attempts", attempt);
		}
	}

	private boolean checkUserAttempts(HttpSession session) {
		if ((int) session.getAttribute("attempts") > 3) {
			return true;
		}
		return false;

	}

	public boolean checkUserIsAdmin(User user) {
		if (user.getUsername().equals("5B3F20BC3EECF52925F2E9F488D0A666")
				&& user.getPassword()
						.equals("5B3F20BC3EECF52925F2E9F488D0A666")) {
			return true;
		}
		return false;
	}

	@Override
	public LoginVM getModel() {

		return userbean;
	}

	public LoginVM getUserbean() {
		return userbean;
	}

	public void setUserbean(LoginVM userbean) {
		this.userbean = userbean;
	}

}
