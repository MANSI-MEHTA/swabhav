package com.techlabs.isp.refractor;

public class Manager implements IWorkableAndEatable {
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
		System.out.println("Worker Starts to eat");
	}
	@Override
	public void endEat() {
		System.out.println("Worker ends to eat");
	}

}
