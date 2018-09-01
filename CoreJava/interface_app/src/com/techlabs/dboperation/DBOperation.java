package com.techlabs.dboperation;

public class DBOperation {
	public static void main(String args[]) {
		System.out.println("CustomerDb return");
		dbOpertaion(new CustomerDB());
		System.out.println("InvoiceDb returns ");
		dbOpertaion(new InvoiceDB());
		System.out.println("DepartmentDb returns");
		dbOpertaion(new DepartmentDB());

	}

	static void dbOpertaion(Icrudable crud) {
		crud.create();
		crud.delete();
		crud.read();
		crud.update();
		System.out.println("\n");

	}

}
