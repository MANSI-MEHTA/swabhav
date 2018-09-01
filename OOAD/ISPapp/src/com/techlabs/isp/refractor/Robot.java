package com.techlabs.isp.refractor;

public class Robot implements IWorkable {
	@Override
	public void startWork() {
		System.out.println("Worker Starts to work");
	}

	@Override

	public void endWork() {
		System.out.println("Worker end the work");
	}

}
