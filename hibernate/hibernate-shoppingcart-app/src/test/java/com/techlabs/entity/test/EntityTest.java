package com.techlabs.entity.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Customer;
import com.techlabs.entity.LineItem;
import com.techlabs.entity.Order;
import com.techlabs.entity.Product;

public class EntityTest {

	public static void main(String args[]) throws Exception {
		Date date = new Date();
		SimpleDateFormat convert = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS ");

		Customer cust = new Customer(UUID.randomUUID(), "varshil", "virar");

		Set<Order> orderset = new HashSet<Order>();
		Set<LineItem> lineitemset1 = new HashSet<LineItem>();
		Set<LineItem> lineitemset2 = new HashSet<LineItem>();
		Set<LineItem> product1set = new HashSet<LineItem>();
		Set<LineItem> product2set = new HashSet<LineItem>();
		Set<LineItem> product3set = new HashSet<LineItem>();

		Order order1 = new Order(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), convert.format(date), cust);
		Order order2 = new Order(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), convert.format(date), cust);

		Product product1 = new Product(1011, "Laptop", 50000, 1000);
		Product product2 = new Product(1022, "mobile", 10000, 500);
		Product product3 = new Product(1044, "AC", 25000, 2000);

		LineItem li1 = new LineItem(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), 10, order1, product1);

		LineItem li2 = new LineItem(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), 10, order1, product3);

		LineItem li3 = new LineItem(Math.abs(UUID.randomUUID()
				.getMostSignificantBits()), 2, order2, product2);

		product1set.add(li1);
		product2set.add(li3);
		product3set.add(li2);

		product1.setSetlineitem(product1set);
		product2.setSetlineitem(product2set);
		product3.setSetlineitem(product3set);

		lineitemset1.add(li1);
		lineitemset1.add(li2);
		order1.setSetoflineitems(lineitemset1);
		lineitemset2.add(li3);
		order2.setSetoflineitems(lineitemset2);

		orderset.add(order1);
		orderset.add(order2);
		cust.setOrder(orderset);
		try {
			Configuration config = new Configuration();
			config.configure("hibernate-cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			Session hbsession = factory.getCurrentSession();

			hbsession.beginTransaction();
			hbsession.save(cust);
			hbsession.save(product1);
			hbsession.save(product2);
			hbsession.save(product3);
			
			hbsession.save(li1);
			hbsession.save(li2);
			hbsession.save(li3);

			hbsession.save(order1);
			hbsession.save(order2);
			

			hbsession.getTransaction().commit();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
