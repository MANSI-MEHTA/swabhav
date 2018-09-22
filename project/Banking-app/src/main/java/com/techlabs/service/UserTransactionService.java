package com.techlabs.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.UserTransaction;
import com.techlabs.repo.UserTransactionRepo;

@Service("transactionservice")
public class UserTransactionService {

	@Autowired
	private UserTransactionRepo transaction_repo;
	
	public long generateTransactionId(){
		return Math.abs(UUID.randomUUID().getMostSignificantBits());
	}
	public void  printPassbook(UserTransaction transaction){
		this.transaction_repo.printPassbook(transaction);
	}

	public List<UserTransaction> getAllTransaction(long acc_no){
		return this.transaction_repo.getAllTransaction(acc_no);
	}
	public UserTransactionRepo getTransaction_repo() {
		return transaction_repo;
	}

	@Autowired
	public void setTransaction_repo(UserTransactionRepo transaction_repo) {
		this.transaction_repo = transaction_repo;
	}
	
	
}
