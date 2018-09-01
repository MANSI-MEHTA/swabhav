package com.techlabs.bank.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.techlabs.bank.Manager;
import com.techlabs.bank.Specialisation;

public class ManageTestClass {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date dob = dateFormat.parse("01-10-1996");
		Date doj = dateFormat.parse("02-07-2018");
		double ctc = 515151;
		Manager manager = new Manager("varshil", Specialisation.EQUITY, dob, doj, ctc);
		manager.checkCTC(ctc);
		manager.checkDateOfJoiningAndBirth(doj);
		long code = manager.uniqueCodeGenerator();
		System.out.println(code);
	}

}
