package com.techlabs;

import java.sql.*;

public class TestPreventSqlInjection {
	private Connection conn;

	public TestPreventSqlInjection(Connection conn) {
		super();
		this.conn = conn;
	}

	public void getStudentById(int rollno) {
		try {
			PreparedStatement stmt = conn
					.prepareStatement("Select * from student where rollno=?");
			stmt.setInt(1, rollno);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("rollno") + ",");
				System.out.print(rs.getString("fname") + ",");
				System.out.print(rs.getString("lname") + ",");
				System.out.print(rs.getString("cgpi") + ",");
				System.out.print(rs.getString("gender") + ",");
				System.out.print(rs.getString("college_id") + ",");
				System.out.println("\n");

			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
