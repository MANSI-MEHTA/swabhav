package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Cart;
import com.techlabs.entity.Customers;

@Repository
public class CartRepository {
	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void insertlineitemincarttable(Cart cart, Set<Cart> setofcart,
			String username, String cust_id) {

		System.out.println(username);
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		hbsession.save(cart);
		hbsession.getTransaction().commit();
		hbsession.close();

	}

	public Customers getCartOfCustomerFromDB(String username) {
		System.out.println("from cart repository method" + username);
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = hbsession
				.createQuery("from Customers where username=:user");
		query.setParameter("user", username);
		Customers customer = (Customers) query.uniqueResult();
		System.out.println("Customer details " + customer);

		// Query query1 = hbsession
		// .createQuery("from Cart where cust_id=:id");
		// query1.setParameter("id", customer.getCust_id());
		// List<Cart> listincart=(List<Cart>)query1.list();
		// //Set<Cart> setincart=(Set<Cart>) customer.getCart();
		//
		// System.out.println("retrieved through cust_id" + listincart);
		hbsession.getTransaction().commit();
		return customer;

	}

	@SuppressWarnings("unchecked")
	public List<Cart> getListOfCartFromDB(String cust_id) {
		List<Cart> listofcart=new ArrayList<Cart>();
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = hbsession
				.createQuery("from Cart where cust_id=:id");
		query.setParameter("id", cust_id);
		listofcart =  (List<Cart>) query.list();
		System.out.println("Customer details " + listofcart);
		return listofcart;
	}

}
