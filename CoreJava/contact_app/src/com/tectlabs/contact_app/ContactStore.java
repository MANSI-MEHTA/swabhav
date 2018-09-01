package com.tectlabs.contact_app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactStore {

	private String fileName;

	public ContactStore(String fileName) {
		this.fileName = fileName;
	}

	public void serializeIt(List<Contact> c) throws Exception {
		FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(c);
		out.close();
		fileOut.close();
		System.out.println("\nSerialization Successful\n");
	}

	public List<Contact> deserializeIt() throws Exception {
		File f = new File(fileName);
		if (f.exists()) {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);

			@SuppressWarnings("unchecked")
			List<Contact> contactList = (List<Contact>) in.readObject();
			fileIn.close();
			in.close();
			return contactList;

		}

		return new ArrayList<Contact>();
	}

	public void Export(List<Contact> c) throws Exception {
		FileWriter oneline = new FileWriter("product.csv");
		for (int i = 0; i < c.size(); i++) {

			oneline.append(c.get(i).getFirstName());
			oneline.append(",");
			oneline.append(c.get(i).getLastName());
			oneline.append(",");
			oneline.append(c.get(i).getEmail());
			oneline.append('\n');
		}
		oneline.flush();
		oneline.close();

	}

}
