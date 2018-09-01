package com.techlabs.duck;

public abstract class Duck {
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackbehaviour;

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackbehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks float...");
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackbehaviour = quackBehaviour;
	}
}
