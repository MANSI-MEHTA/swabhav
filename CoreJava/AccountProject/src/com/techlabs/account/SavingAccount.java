package com.techlabs.account;

public class SavingAccount extends Account {

	public SavingAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public Boolean withdraw(double amount) {
		if(this.getBalance()<amount) {
			return false;
		}
		else if(this.getBalance()-amount<4000){
			return false;
			
		}
		else {
			double balance=this.getBalance()-amount;
			this.setBalance(balance);
			return true;
		}
	}

}
