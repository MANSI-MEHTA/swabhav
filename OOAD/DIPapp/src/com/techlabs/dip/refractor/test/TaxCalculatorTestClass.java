package com.techlabs.dip.refractor.test;

import com.techlabs.dip.refractor.TaxCalculator;
import com.techlabs.dip.refractor.TxtLogType;

public class TaxCalculatorTestClass {
	public static void main(String args[]) {
		TaxCalculator taxCalculator = new TaxCalculator(new TxtLogType());
		System.out.println(taxCalculator.calulate(8, 4));
	}

}
