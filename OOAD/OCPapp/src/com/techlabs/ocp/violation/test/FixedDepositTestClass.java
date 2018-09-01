package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class FixedDepositTestClass {
	public static void main(String args[]) {
		FixedDeposit deposit = new FixedDeposit("varshil", 250000, 2, FestivalType.DIWALI);
		System.out.println(deposit.calculateInterest());
	}
}
