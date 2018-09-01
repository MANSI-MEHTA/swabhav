package com.techlabs.bank.test;

import java.text.SimpleDateFormat;
import java.util.List;

import com.techlabs.bank.Bank;
import com.techlabs.bank.Manager;
import com.techlabs.bank.Specialisation;

public class BankTestClass {
	public static void main(String args[]) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Bank bank = new Bank();
		Manager manager = new Manager("varshil", Specialisation.EQUITY, dateFormat.parse("01-10-1996"),
				dateFormat.parse("02-07-2018"), 515151);
		bank.storeManager(manager);
		List<Manager> count = bank.retrieve();
		System.out.println("Number of retrieved manager shoud be equal to number of stored manager: " + count.size());
	}
}
