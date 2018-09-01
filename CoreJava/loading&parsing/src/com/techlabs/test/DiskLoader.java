package com.techlabs.test;

import java.util.*;
import java.io.*;

public class DiskLoader implements ILoader {
	public ArrayList<String> load() {
		ArrayList<String> recordlist = new ArrayList<String>();
		try {
			File file = new File("record.csv");
			FileReader fileReader = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(fileReader);
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
