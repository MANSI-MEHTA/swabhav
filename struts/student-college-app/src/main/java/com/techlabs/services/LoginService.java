package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.User;

public class LoginService {
	private List<User> listOfusers = new ArrayList<User>();

	public LoginService() {
		listOfusers.add(new User("root", "root"));
		listOfusers.add(new User("swabhav", "swabhav"));
		listOfusers.add(new User("aurionpro", "aurionpro"));

	}
	public boolean authenticate(String username,String password){
		for(User user:listOfusers){
			if((user.getUsername().equals(username)) && (user.getPassword().equals(password))){
				return true;
			}
				
		}
		return false;
	}
	public List<User> getUsers() {
		return listOfusers;
	}

	public void setUsers(List<User> users) {
		this.listOfusers = users;
	}

}
