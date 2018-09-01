package com.techlabs.bank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Manager> listofmanager = new ArrayList<Manager>();
	private String filename = "record.ser";

	@SuppressWarnings("unchecked")
	public Bank() throws Exception {
		FileInputStream fin = new FileInputStream(filename);
		@SuppressWarnings("resource")
		ObjectInputStream in = new ObjectInputStream(fin);
		this.listofmanager = (List<Manager>) in.readObject();

	}

	public void storeManager(Manager manager) throws IOException {
		listofmanager.add(manager);

	}

	@SuppressWarnings("unchecked")
	public List<Manager> retrieve() throws IOException, ClassNotFoundException {
		List<Manager> list = null;
		FileInputStream fin = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(fin);
		list = (List<Manager>) in.readObject();
		in.close();
		fin.close();

		return list;

	}

	public void exit() throws IOException {
		FileOutputStream fout = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(listofmanager);
		out.close();
		fout.close();

	}
}
