package com.techlabs.strategy;

public class DoMultiplication implements IStrategy {

	@Override
	public int doOperation(int number1,int number2) {
		return number1*number2;
		
	}

}
