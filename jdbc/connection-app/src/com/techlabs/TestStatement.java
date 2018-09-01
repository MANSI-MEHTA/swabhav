package com.techlabs;

import java.sql.*;;

public class TestStatement {
	private Statement stmt = null;
	private Connection conn;

	public TestStatement(Connection conn) {
		this.conn = conn;
	}

	public ResultSet getStatementForSelect() {
		try {
			ResultSet result = null;
			stmt = conn.createStatement();
			result = stmt.executeQuery("select * from Student");
			System.out.println("Concrete Class for statment is: "+stmt.getClass());
			return result;
		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}
}
