package com.techlabs.account;


public class AccountTest {
	public static void main(String args[])throws AmountlessException {
		Account account = new Account("varshil", 10000);
		Account account1 = new Account("shubham",1500);
		Account account2 = new Account("manoj",2000);
		System.out.println(account.getName()+" Your Account Number is: "+account.getAccount_No());
		System.out.println(account1.getName()+" Your Account Number is: "+account1.getAccount_No());
		System.out.println(account.getName()+" Your Account Number is: "+account.getAccount_No());
		account.withdraw(10000);
		
		//caseStudy1(account, account1);
		

	}

	private static void caseStudy1(Account account, Account account1) throws AmountlessException {
		System.out.println(account.withdraw(1000));
		
		account.deposit(10000);
		account1.deposit(10000);
		System.out.println(account1.withdraw(500));
		Account rich=account.whoIsRich(account1);
		printDetails(rich);
		System.out.println("Number of accounts: "+Account.count);
	}

	static void printDetails(Account account) {
		System.out.println("Your Balance is :"+account.getBalance());
		System.out.println("Your Name :"+account.getName());
		System.out.println("Your Account Number: "+account.getAccount_No());
		

	}

}
