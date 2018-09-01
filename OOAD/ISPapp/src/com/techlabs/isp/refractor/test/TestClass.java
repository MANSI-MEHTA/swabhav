package com.techlabs.isp.refractor.test;

import com.techlabs.isp.refractor.IEatable;
import com.techlabs.isp.refractor.IWorkable;
import com.techlabs.isp.refractor.Manager;
import com.techlabs.isp.refractor.Robot;

public class TestClass {
	public static void main(String args[]) {
		atTheWorkStation(new Manager());
		atTheWorkStation(new Robot());
		atTheCafe(new Manager());

	}

	public static void atTheCafe(IEatable worker) {
		System.out.println("Worker at the cafe");
		worker.startEat();
		worker.endEat();
	}

	public static void atTheWorkStation(IWorkable worker) {
		System.out.println("Robot/manager at the workstation");
		worker.startWork();
		worker.endWork();
	}

}
