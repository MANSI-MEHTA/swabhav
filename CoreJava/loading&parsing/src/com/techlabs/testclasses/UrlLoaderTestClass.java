package com.techlabs.testclasses;

import java.util.ArrayList;

import com.techlabs.test.UrlLoader;

public class UrlLoaderTestClass {
	public static void main(String args[]) {
		UrlLoader urlloader = new UrlLoader();
		ArrayList<String> listofString = urlloader.load();
		for (String list : listofString) {
			System.out.println(list);

		}

	}

}
