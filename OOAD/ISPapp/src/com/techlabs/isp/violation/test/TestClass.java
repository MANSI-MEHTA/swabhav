package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorker;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Robot;

public class TestClass {
	public static void main(String args[]) {
		atTheWorkStation(new Manager());
		atTheWorkStation(new Robot());
		atTheCafe(new Manager());
		atTheCafe(new Robot());

	}

	public static void atTheCafe(IWorker worker) {
		System.out.println("Worker at the cafe");
		worker.startEat();
		worker.endEat();
	}

	public static void atTheWorkStation(IWorker worker) {
		System.out.println("Robot/manager at the workstation");
		worker.startWork();
		worker.endWork();
	}
}
