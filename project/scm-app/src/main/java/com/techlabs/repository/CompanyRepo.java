package com.techlabs.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Company;
import com.techlabs.entity.Credential;

@Repository
public class CompanyRepo {

	@Autowired
	private SessionFactory factory;

	
	public Company authenticateAdmin(String username,String password){
		Company admin =null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = hbsession.createQuery("FROM Company WHERE username=:user AND password=:pass");
		query.setParameter("user", username);
		query.setParameter("pass", password);
		
		admin = (Company) query.uniqueResult();
		hbsession.getTransaction().commit();
		hbsession.close();
		
		return admin;
	}
	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	
}
