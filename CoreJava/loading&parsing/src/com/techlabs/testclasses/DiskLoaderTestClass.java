package com.techlabs.testclasses;

import java.util.ArrayList;

import com.techlabs.test.DiskLoader;

public class DiskLoaderTestClass {
	public static void main(String args[]) {
		DiskLoader diskloader=new DiskLoader();
		ArrayList<String> listofString=diskloader.load();
		for(String list:listofString) {
			System.out.println(list);
			
		}

	}
}
