package com.techlabs.account;

public class Account {
	private int account_no;
	private String name;
	private double currentbalance;
	public static int count = 10001;

	Account(String name, double currentbalance) {
		count++;
		this.account_no = count;
		this.name = name;
		this.currentbalance = currentbalance;

	}

	public Boolean withdraw(int amount)throws AmountlessException {
		try {
		if (currentbalance < amount) {
			throw new AmountlessException("Insufficient Balance");
		
		} else if ((currentbalance - amount) < 1000) {
			throw new AmountlessException("Insufficient Balance After withdrawing");
			
		}
		else {
			currentbalance -= amount;
			return true;
		}

		
		}catch(AmountlessException e) {
			System.out.println("AmountlessException "+e.getMessage());
			return false;
			
		}
}

	public double getBalance() {
		return currentbalance;
	}

	public String getName() {
		return name;
	}

	public int getAccount_No() {
		return account_no;
	}

	public Boolean deposit(int amount) {
		currentbalance += amount;
		return true;
	}

	public Account whoIsRich(Account account1) {
		if (currentbalance > account1.currentbalance) {
			return this;
		} else
			return account1;
	}
}
