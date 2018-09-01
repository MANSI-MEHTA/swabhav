package com.techlabs.duck;

public class FlyNoWay implements FlyBehaviour {
	@Override
	public void fly() {
		System.out.println("They dont fly");
	}
}
