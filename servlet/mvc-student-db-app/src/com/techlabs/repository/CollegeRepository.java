package com.techlabs.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.College;
import com.techlabs.model.Student;
import com.techlabs.utility.CreateConnection;

public class CollegeRepository {
	private CreateConnection config;
	private Connection conn;

	public CollegeRepository() {
		config = CreateConnection.getInstanceOf();
		conn = config.getConnection();
	}

	public List<College> getColleges() {
		List<College> listOfColleges = new ArrayList<College>();
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM college");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int clg_id = Integer.parseInt(rs.getString("id"));
				String clg_name = rs.getString("name");
				String location = rs.getString("location");

				listOfColleges.add(new College(clg_id, clg_name, location));

			}

			return listOfColleges;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;

		}

	}
	public College getCollegeById(int id){
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM college WHERE id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				int clg_id = Integer.parseInt(rs.getString("id"));
				String clg_name = rs.getString("name");
				String location = rs.getString("location");
				College college = new College(clg_id,clg_name,location);
				return college;
			}
				
			return null;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}
	public List<Student> getStudentByCollegeId(int id){
		List<Student> listofStudentsByCollegeId=new ArrayList<Student>();
		
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM student WHERE college_id=? ");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int rollno = Integer.parseInt(rs.getString("rollno"));
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				double cgpi = Double.parseDouble(rs.getString("cgpi"));
				String gender = rs.getString("gender");
				int clg_id = Integer.parseInt(rs.getString("college_id"));

				listofStudentsByCollegeId.add(new Student(fname, lname, clg_id, rollno,
						cgpi, gender));

			}
			
			return listofStudentsByCollegeId;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;

		}

	}
	public List<College> getNameAndIdOfColleges(){
		List<College> listOfNamesAndIdOfColleges=new ArrayList<College>();
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT id,name FROM college");
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int clg_id = Integer.parseInt(rs.getString("id"));
				String clg_name = rs.getString("name");
				listOfNamesAndIdOfColleges.add(new College(clg_id,clg_name,null));

			}
			
			return listOfNamesAndIdOfColleges;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;

		}

	}
}
