package com.techlabs.account;

public class CurrentAccount extends Account {
	private double overdraft;

	public CurrentAccount(String name, double balance) {
		super(name, balance);
		overdraft = 10000;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double balance) {
		this.overdraft = balance;
	}

	@Override
	public Boolean withdraw(double amount) {
		if((this.getBalance()+this.getOverdraft())<amount) {
			
			return false;
		}
		else if(this.getBalance()>=amount){
			double balance=this.getBalance()-amount;
			this.setBalance(balance);
			return true;
		}
		else {
			double balance=amount-this.getBalance();
			balance=this.getOverdraft()-balance;
			this.setOverdraft(balance);
			return true;
		}
	
	}

}
