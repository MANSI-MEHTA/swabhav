package com.techlabs.entity.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fasterxml.uuid.Generators;
import com.techlabs.entity.Customer;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Order;
import com.techlabs.entity.Product;

public class EntityTest {

	public static void main(String args[]) {
		Date date = new Date();
		SimpleDateFormat convert = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS ");

		Customer cust = new Customer(UUID.randomUUID(), "varshil", "virar");

		Set<Order> orderset = new HashSet<Order>();
		Set<LineItem> lineitemset = new HashSet<LineItem>();

		Order order1 = new Order(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), convert.format(date), cust);
		Order order2 = new Order(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), convert.format(date), cust);

		Product product1 = new Product(1011, "Laptop", 25000, 50);
		LineItem li1 = new LineItem(Generators.timeBasedGenerator().generate()
				.clockSequence(), 10, order1, product1);

		orderset.add(order1);
		orderset.add(order2);
		cust.setOrder(orderset);
		try {
			Configuration config = new Configuration();
			config.configure("hibernate-cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			Session hbsession = factory.getCurrentSession();

			hbsession.beginTransaction();
			// hbsession.save(cust);
			// hbsession.save(order1);
			// hbsession.save(order2);
			//
			hbsession.getTransaction().commit();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}