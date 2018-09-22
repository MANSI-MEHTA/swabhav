package com.techlabs.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Customers;
import com.techlabs.repository.CustomerRepository;

@Service("customerservice")
public class CustomerService {
	@Autowired
	private CustomerRepository cust_repo;

	public boolean authenticateCustomer(String username,String password){
		return this.cust_repo.authenticateCustomer(username, password);
	}
	public CustomerRepository getCust_repo() {
		return cust_repo;
	}
	public boolean checkCustomerExists(String username){
		return this.cust_repo.checkCustomerExists(username);
	}

	public String generateUUID(){
		return String.valueOf(Math.abs(UUID.randomUUID().getMostSignificantBits()));
	}
	public void registerCustomer(Customers customer){
		this.cust_repo.registeruser(customer);
	}
	public String getCustomerId(String username){
		return this.cust_repo.getCustomerId(username);
	}
	@Autowired
	public void setCust_repo(CustomerRepository cust_repo) {
		this.cust_repo = cust_repo;
	}

}
