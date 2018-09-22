package com.techlabs.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Customers;

@Repository
public class CustomerRepository {

	@Autowired
	private SessionFactory factory;
	private Session hbsession;

	public boolean authenticateCustomer(String username, String password) {
		hbsession = this.factory.openSession();
		hbsession.beginTransaction();
		
		@SuppressWarnings("unchecked")
		List<Customers> listofcustomer = hbsession.createCriteria(
				Customers.class).list();
		if (listofcustomer.isEmpty()) {
			return false;
		}
		for (Customers customer : listofcustomer) {
			if ((customer.getUsername().equals(username))
					&& (customer.getPassword().equals(password))) {
				return true;
			}
		}
		return false;
	}

	public boolean checkCustomerExists(String username) {
		hbsession = this.factory.openSession();
		hbsession.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Customers> listofcustomer = hbsession.createCriteria(
				Customers.class).list();
		if (listofcustomer.isEmpty()) {
			return false;
		}
		for (Customers customer : listofcustomer) {
			if ((customer.getUsername().equals(username))) {
				return true;
			}
		}
		return false;

	}

	public void registeruser(Customers customer) {
		hbsession = this.factory.openSession();
		hbsession.beginTransaction();
		hbsession.save(customer);
		hbsession.getTransaction().commit();
	}

	public String getCustomerId(String username) {
		hbsession = this.factory.openSession();
		hbsession.beginTransaction();
		Query query = hbsession
				.createQuery("from Customers where username=:user");
		query.setString("user", username);
		Customers customer = (Customers) query.uniqueResult();

		System.out.println("From repository" + customer.getCust_id());
		hbsession.getTransaction().commit();
		return customer.getCust_id();
	}

	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
