package com.techlabs.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class UrlLoader implements ILoader {
	public ArrayList<String> load() {
		ArrayList<String> recordlist = new ArrayList<String>();
		try {
			URL oracle = new URL("https://swabhav-tech.firebaseapp.com/emp.txt ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(oracle.openStream()));
			String line=reader.readLine();
			while (line != null) {
				recordlist.add(line);
				line=reader.readLine();
			}
			return recordlist;
		} catch (Exception e) {
			System.out.println(e);
		}
		return new ArrayList<String>();

	}

}
