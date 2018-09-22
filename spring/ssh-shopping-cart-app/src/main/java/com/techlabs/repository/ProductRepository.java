package com.techlabs.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Product;

@Repository
public class ProductRepository {

	@Autowired
	private SessionFactory factory;
	List<Product> listofproducts;
	public List<Product> getAllProducts() {
		Session hbsession = this.factory.openSession();
		hbsession.beginTransaction();

		Query query = hbsession.createQuery("from Product");
		listofproducts = query.list();
		
		return listofproducts;
	}

	public Product getProductById(int id) {
		for(Product product:listofproducts){
			if(product.getId()==id){
				return product;
			}
		}
		return null;
	}

	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
