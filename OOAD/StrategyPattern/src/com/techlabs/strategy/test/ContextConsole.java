package com.techlabs.strategy.test;

import com.techlabs.strategy.Context;
import com.techlabs.strategy.DoAddition;
import com.techlabs.strategy.DoMultiplication;
import com.techlabs.strategy.DoSubstraction;

public class ContextConsole {
	public static void main(String args[]) {
		Context context = new Context(new DoAddition());
		System.out.println("After addition of 7 & 6:" + context.executeStrategy(7, 6));
		Context context1 = new Context(new DoSubstraction());
		System.out.println("After Substraction of 7 & 6: " + context1.executeStrategy(7, 6));
		Context context2 = new Context(new DoMultiplication());
		System.out.println("After multiplication of 7 & 6:" + context2.executeStrategy(7, 6));

	}
}
