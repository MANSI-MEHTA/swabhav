package com.techlabs.file;

import java.io.FileReader;
import java.io.FileWriter;

public class File {
	public void write() {
		try {
			FileWriter fw = new FileWriter("filewriter&reader.txt");
			fw.write("fdkmeowmomodm");
			fw.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void read() {
		int ch;

		try {

			FileReader fr = new FileReader("filewriter&reader.txt");
			while ((ch = fr.read()) != -1)
				System.out.print((char) ch);

			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
