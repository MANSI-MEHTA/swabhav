package com.techlabs.isp.violation;

public class Robot implements IWorker {
	@Override
	public void startWork() {
		System.out.println("Worker Starts to work");
	}

	@Override

	public void endWork() {
		System.out.println("Worker end the work");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot cannot eat");
	}

	@Override
	public void endEat() {
		throw new RuntimeException("Robot cannot eat");

	}

}
