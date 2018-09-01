package com.tectlabs.contact_app;
import java.util.*;

import java.util.List;

public class ContactTest {
	private static String filename="contactfile.ser";
	private static List<Contact> contact = new ArrayList<Contact>();
	private static ContactStore store = new ContactStore(filename);
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		contact=store.deserializeIt();
		display(contact);
		while (i != 4) {
			System.out.println("Total Number of contact=" + contact.size());
			System.out.println("1.Display details of contacts");
			System.out.println("2.Add");
			System.out.println("3.Export into CSV and View");
			System.out.println("4.Exit");
			i = sc.nextInt();
			switch (i) {
			case 1:
				display(store.deserializeIt());

				break;
			case 2:
				System.out.println("Enter firstname followed by lastname and email");
				contact.add(new Contact(sc.next(), sc.next(), sc.next()));
				break;
			case 3:
				store.Export(contact);
				break;
			case 4:
				store.serializeIt(contact);
				break;

			}
			sc.close();
		}
	}

	static void display(List<Contact> contact) {
		for (int j = 0; j < contact.size(); j++) {
			System.out.print(contact.get(j).getFirstName() + "\t" + "\t" + "\t");
			System.out.print(contact.get(j).getLastName() + "\t" + "\t" + "\t");
			System.out.print(contact.get(j).getEmail() + "\t" + "\t" + "\t");
			System.out.println();

		}

	}

}
