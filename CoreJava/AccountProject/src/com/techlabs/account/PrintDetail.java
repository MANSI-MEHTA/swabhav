package com.techlabs.account;

public class PrintDetail {
	public static void main(String []args) {
		CurrentAccount current_acc1=new CurrentAccount("varshil",15220);
		CurrentAccount current_acc2=new CurrentAccount("shubham",20000);
		SavingAccount saving_acc1=new SavingAccount("shubham",20000);
		SavingAccount saving_acc2=new SavingAccount("shubham",20000);
		if(current_acc1.withdraw(1000)) {
			System.out.println("Transaction successfull");
		}
		else {
			System.out.println("Transaction successfull");
			
		}
		
	}
}
