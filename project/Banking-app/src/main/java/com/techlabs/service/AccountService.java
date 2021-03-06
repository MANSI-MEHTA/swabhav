package com.techlabs.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Account;
import com.techlabs.repo.AccountRepository;

@Service("accountservice")
public class AccountService {

	@Autowired
	private AccountRepository acc_repo;

	public long generateAccountNumber() {
		return Math.abs(UUID.randomUUID().getMostSignificantBits());
	}

	public void CreateAccount(Account account) {
		acc_repo.createAccount(account);
	}

	public Account getAccountByAcc_no(long acc_no) {
		return this.acc_repo.getAccountByAcc_no(acc_no);
	}
	public void updateBalanceByAcc_no(Account account){
		this.acc_repo.updateBalanceByAcc_no(account);
	}

	public AccountRepository getAcc_repo() {
		return acc_repo;
	}

	@Autowired
	public void setAcc_repo(AccountRepository acc_repo) {
		this.acc_repo = acc_repo;
	}

}
