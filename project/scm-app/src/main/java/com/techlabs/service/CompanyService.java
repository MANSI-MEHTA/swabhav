package com.techlabs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Company;
import com.techlabs.repository.CompanyRepo;

@Service("companyservice")
public class CompanyService {

	@Autowired
	private CompanyRepo company_repo;

	public Company authenticateAdmin(String username,String password){
		return this.company_repo.authenticateAdmin(username, password);
	}
	public CompanyRepo getCompany_repo() {
		return company_repo;
	}

	@Autowired
	public void setCompany_repo(CompanyRepo company_repo) {
		this.company_repo = company_repo;
	}
	
	
}
