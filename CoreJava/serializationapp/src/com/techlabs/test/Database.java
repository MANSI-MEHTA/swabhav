package com.techlabs.test;

import java.io.*;

public class Database {
	public void serialize(Student s) throws Exception {
		String filename = "file.ser";
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(s);

		out.close();
		file.close();

	}

	public Student deSerialize() throws Exception {

		FileInputStream file = new FileInputStream("file.ser");
		ObjectInputStream in = new ObjectInputStream(file);

		Student object1 = (Student) in.readObject();

		in.close();
		file.close();
		return object1;

	}
}
