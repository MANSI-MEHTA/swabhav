package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.User;
import com.techlabs.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo user_repo;

	public boolean authenticateUser(User user){
		return this.user_repo.AuthenticateUser(user);
	}
	public boolean checkUserExists(String username){
		return this.user_repo.checkUserExists(username);
	}
	public void registerUser(User user){
		this.user_repo.registerUser(user);
	}
	public UserRepo getUser_repo() {
		return user_repo;
	}

	@Autowired
	public void setUser_repo(UserRepo user_repo) {
		this.user_repo = user_repo;
	}

}
