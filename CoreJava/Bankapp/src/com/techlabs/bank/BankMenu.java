package com.techlabs.bank;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class BankMenu {
	public static void main(String args[]) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Scanner sc = new Scanner(System.in);
		int choice;
		Bank bank = new Bank();
		
		do {
			System.out.println("Select anyone option");
			System.out.println("1.Add Manager");
			System.out.println("2.Retrieve managers detail");
			System.out.println("3.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Manager manager1 = new Manager(sc.next(), Specialisation.INSURANCE, dateFormat.parse(sc.next()),
						dateFormat.parse(sc.next()), sc.nextDouble());
				bank.storeManager(manager1);

				break;
			case 2:
				display(bank.retrieve());
				break;
			case 3:
				bank.exit();
				break;

			}

		} while (choice != 3);
		sc.close();

	}

	public static void display(List<Manager> listofmanagers) {
		for (Manager manager : listofmanagers) {
			System.out.println(manager.getName() + "\t\t" + manager.getCode() + "\t\t" + manager.getSpecalised()
					+ "\t\t" + manager.getDOB() + "\t\t" + manager.getDOJ() + "\t\t" + manager.getCTC());
		}
	}
}
