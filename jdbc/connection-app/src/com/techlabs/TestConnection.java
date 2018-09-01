package com.techlabs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestConnection {
	public static DatabaseMetaData md = null;

	public static void main(String args[]) throws SQLException {
		CreateConnection createconn;
		createconn = CreateConnection.getInstanceOf();
		Connection conn = createconn.getConnection();

		//TestStatement teststmt = new TestStatement(conn);
		//ResultSet rs = teststmt.getStatementForSelect();

		//TestResultSet testresultset = new TestResultSet();
		//testresultset.display(rs);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no to search detail ");
		int rollno=sc.nextInt();
		
		//TestSqlInjection  injector=new TestSqlInjection(conn);
		//injector.getStudentById(rollno);
		
		TestPreventSqlInjection preventinjector=new TestPreventSqlInjection(conn);
		preventinjector.getStudentById(rollno);
		//displayCurrentDatabase(conn);
		//displayAllTables(conn);
	}

	public static void displayCurrentDatabase(Connection conn) {
		try {
			System.out.println("DataBase Name is:" + conn.getCatalog());
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	public static void displayAllTables(Connection conn) {
		try {
			ResultSet rs = null;
			md = conn.getMetaData();
			rs = md.getTables(null, null, "%", null);
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

}
