package com.techlabs.dip.violation;

public class TxtLogType{
	public void log(String time, String message) {
		System.err.print("There is an Error at ");
		System.out.print(time + " " + message);

	}
}
