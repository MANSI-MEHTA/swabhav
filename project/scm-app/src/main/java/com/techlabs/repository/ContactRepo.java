package com.techlabs.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Contact;
import com.techlabs.entity.Tenant;

@Repository
public class ContactRepo {

	@Autowired
	private SessionFactory factory;

	public void saveTenantContact(Contact contact) {
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		hbsession.save(contact);
		hbsession.getTransaction().commit();
		hbsession.close();
	}

	public boolean CheckContactExist(long contact_no) {
		Contact contact = null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = hbsession
				.createQuery("FROM Contact WHERE contact_no=:number");
		query.setParameter("number", contact_no);
		contact = (Contact) query.uniqueResult();
		hbsession.getTransaction().commit();
		hbsession.close();
		if (contact == null) {
			return false;
		}

		return true;

	}

	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
