package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.LogType;
import com.techlabs.dip.violation.TaxCalculator;

public class TaxCalculatorTest {
	public static void main(String args[]) {
		TaxCalculator taxCalculator = new TaxCalculator(LogType.WIN);
		System.out.println(taxCalculator.calulate(8, 0));
	}

}
