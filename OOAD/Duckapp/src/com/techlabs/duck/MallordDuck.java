package com.techlabs.duck;

public class MallordDuck extends Duck{
	public MallordDuck() {
		quackbehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("Mallard Duck");
		
	}

}
