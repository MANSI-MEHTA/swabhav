package com.techlabs.dip.violation;

public class XmlLogType{
	public void log(String time, String message) {
		System.err.print("There is an Error at ");
		System.out.print(time + " " + message);

	}
}
