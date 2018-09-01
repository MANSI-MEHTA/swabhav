package com.techlabs.duck;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackbehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Model Duck");

	}
	

}
