package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.User;


public class LoginService {
	private static List<User> listOfUsers = new ArrayList<User>();
	private static LoginService object;
	private boolean loginState=false;

	private LoginService() {

	}

	public static LoginService getInstance() {
		if (object == null) {
			listOfUsers.add(new User("root", "root"));
			listOfUsers.add(new User("swabhav", "swbhav"));
			listOfUsers.add(new User("sakec", "sakec"));

			object = new LoginService();

		}
		return object;
	}
	public boolean authenticateUser(String username,String password){
		for(User user:listOfUsers){
			if(user.getUsername().equals(username) && user.getPassword().equals(password)){
				return true;
			}
		}
		return false;
	}

	public boolean isLoginState() {
		return loginState;
	}

	public void setLoginState(boolean loginState) {
		this.loginState = loginState;
	}
	


}
