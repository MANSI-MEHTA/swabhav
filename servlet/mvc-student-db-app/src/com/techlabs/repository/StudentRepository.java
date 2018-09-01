package com.techlabs.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;
import com.techlabs.utility.CreateConnection;

public class StudentRepository {

	private CreateConnection config;
	private Connection conn;

	public StudentRepository() {
		config = CreateConnection.getInstanceOf();
		conn = config.getConnection();
	}

	public List<Student> getStudents() {
		List<Student> listOfStudents = new ArrayList<Student>();
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM student");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int rollno = Integer.parseInt(rs.getString("rollno"));
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				double cgpi = Double.parseDouble(rs.getString("cgpi"));
				String gender = rs.getString("gender");
				int clg_id = Integer.parseInt(rs.getString("college_id"));

				listOfStudents.add(new Student(fname, lname, clg_id, rollno,
						cgpi, gender));

			}
			
			return listOfStudents;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;

		}
	}

	public void addStudent(Student student) {
		try {
			PreparedStatement stmt = conn
					.prepareStatement("INSERT INTO student(rollno,fname,lname,cgpi,gender,college_id) VALUES(?,?,?,?,?,?)");
			stmt.setInt(1, student.getRollno());
			stmt.setString(2, student.getFname());
			stmt.setString(3, student.getLname());
			stmt.setDouble(4, student.getCgpi());
			stmt.setString(5, student.getGender());
			stmt.setInt(6, student.getClg_Id());
			int i = stmt.executeUpdate();
			System.out.println("this is i:\t" + i);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public Student getStudentById(int id) {
		
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM student WHERE rollno=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				int rollno = Integer.parseInt(rs.getString("rollno"));
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				double cgpi = Double.parseDouble(rs.getString("cgpi"));
				String gender = rs.getString("gender");
				int clg_id = Integer.parseInt(rs.getString("college_id"));
				Student student = new Student(fname, lname, clg_id, rollno,
						cgpi, gender);
				return student;
			}
				
			return null;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	public void updateStudent(Student student){
		try {
			PreparedStatement stmt = conn
					.prepareStatement("UPDATE student SET fname=?,lname=?,cgpi=?,gender=?,college_id=? WHERE rollno=?");
			stmt.setInt(6, student.getRollno());
			stmt.setString(1, student.getFname());
			stmt.setString(2, student.getLname());
			stmt.setDouble(3, student.getCgpi());
			stmt.setString(4, student.getGender());
			stmt.setInt(5, student.getClg_Id());
			int i = stmt.executeUpdate();
			System.out.println("this is i:\t" + i);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
