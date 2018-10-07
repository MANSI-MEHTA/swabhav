package com.techlabs.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Credential;
import com.techlabs.entity.Tenant;

@Repository
public class LoginRepo {

	@Autowired
	private SessionFactory factory;

	public void saveCredentials(Credential credential) {
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		hbsession.save(credential);
		hbsession.getTransaction().commit();
		hbsession.close();
	}

	public Credential authenticate(String username,String password){
		Credential credential =null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = hbsession.createQuery("FROM Credential WHERE username=:user AND password=:pass");
		query.setParameter("user", username);
		query.setParameter("pass", password);
		
		credential = (Credential) query.uniqueResult();
		hbsession.getTransaction().commit();
		hbsession.close();
		
		return credential;
	}
	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
