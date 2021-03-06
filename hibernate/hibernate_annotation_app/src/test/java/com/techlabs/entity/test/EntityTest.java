package com.techlabs.entity.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Student;

public class EntityTest {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate-cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		System.out.println(factory.getClass());
		try {
			Session hbsession = factory.getCurrentSession();
			hbsession.beginTransaction();
			
			//Insert into table
			
			// hbsession.save(new Student("varshil", "mehta"));
			// hbsession.save(new Student("manoj", "m"));
			// hbsession.save(new Student("shubham", "vora"));
			
//Retrieve 1 record from table
			
//			 int id = 1;
//			 Student student = (Student) hbsession.get(Student.class, id);
//			 System.out.println("fname: " + student.getFname() + "\nlname:"
//			 + student.getLname());

			//retrieve all records from table
			
			Criteria criteria = hbsession.createCriteria(Student.class);
			List<Student> listOfStudents = criteria.list();

			for (Student student1 : listOfStudents) {
				System.out.print("fname: " + student1.getFname() + "\tlname:"
						+ student1.getLname());
				System.out.println();
			}
			
			//update 1 record
			
//			 student.setFname("hbdjhe");
//			 student.setLname("bsdhjs");
//			 hbsession.save(student);
			
			//delete 1 record
			// hbsession.delete(student);

			hbsession.getTransaction().commit();
			hbsession.close();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

			factory.close();
		}
	}

}
