package com.techlabs.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.omg.IOP.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.UserTransaction;

@Repository
public class UserTransactionRepo {

	@Autowired
	private SessionFactory factory;

	public void printPassbook(UserTransaction transaction) {
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		hbsession.save(transaction);
		hbsession.getTransaction().commit();
		hbsession.close();
	}

	public List<UserTransaction> getAllTransaction(long acc_no){
		List<UserTransaction> transactions=null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query=hbsession.createQuery("FROM UserTransaction WHERE acc_no=:acc_no ORDER BY transaction_date ");
		query.setParameter("acc_no", acc_no);
		transactions=query.list();
		System.out.println("All transactions are "+transactions);
		hbsession.getTransaction().commit();
		hbsession.close();
		return transactions;
	}
	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
