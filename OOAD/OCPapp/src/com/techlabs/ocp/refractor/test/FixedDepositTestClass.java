package com.techlabs.ocp.refractor.test;

import com.techlabs.ocp.refractor.DiwaliRate;
import com.techlabs.ocp.refractor.FixedDeposit;

public class FixedDepositTestClass {
	public static void main(String args[]) {
		FixedDeposit deposit = new FixedDeposit("varshil", 250000, 2,new DiwaliRate());
		System.out.println(deposit.calculateInterest());
	}
}
