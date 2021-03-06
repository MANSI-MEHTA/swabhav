package com.techlabs.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Account;
import com.techlabs.entity.User;

@Repository
public class UserRepo {
	@Autowired
	private SessionFactory factory;

	public User AuthenticateUser(String username, String password) {
		String state = "activate";
		User user = null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		@SuppressWarnings("unchecked")
		Query query = hbsession
				.createQuery("FROM User WHERE username=:username AND password=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		// query.setParameter("state", state);
		user = (User) query.uniqueResult();
		if (user == null) {

			return null;
		}
		hbsession.getTransaction().commit();
		hbsession.close();

		return user;

	}

	public boolean checkUserExists(String email) {
		System.out.println("Check user exits");

		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		@SuppressWarnings("unchecked")
		Query query = hbsession.createQuery("FROM User WHERE email=:email_id");
		query.setParameter("email_id", email);
		List<User> users = query.list();
		if (users.isEmpty()) {
			System.out.println("user does not exit");

			return false;
		}
		// List<User> listofusers=hbsession.createCriteria(User.class).list();
		// if(listofusers.isEmpty()){
		//
		// return false;
		// }
		// for(User eachuser:listofusers){
		// if(eachuser.getUsername().equals(username) ){
		// System.out.println("true");
		// return true;
		// }
		// }
		hbsession.getTransaction().commit();
		System.out.println("user exits");
		return true;

	}

	public void registerUser(User user) {
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		hbsession.save(user);
		hbsession.getTransaction().commit();
	}

	public User getUserByAcc_no(long acc_no) {
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = (Query) hbsession
				.createQuery("FROM User WHERE acc_no=:num");
		query.setParameter("num", acc_no);
		User user = (User) query.uniqueResult();
		System.out.println("Get User by acc_no" + user);
		hbsession.getTransaction().commit();
		hbsession.close();
		return user;
	}

	public void changeToActivateState(User user) {
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();

		hbsession.update(user);

		hbsession.getTransaction().commit();
		hbsession.close();

	}
	public void changeToLockedState(User user){
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();

		hbsession.update(user);

		hbsession.getTransaction().commit();
		hbsession.close();

	}
	public User getUserByUserName(String username){
		User user=null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = (Query) hbsession
				.createQuery("FROM User WHERE username=:user");
		query.setParameter("user", username);
		user = (User) query.uniqueResult();
		System.out.println("Get User by username" + user);
		hbsession.getTransaction().commit();
		hbsession.close();

		return user;
	}
	public List<User> getAllUsers() {
		List<User> users = null;
		Session hbsession = factory.openSession();
		hbsession.beginTransaction();
		Query query = (Query) hbsession.createQuery("FROM User");
		users = (List<User>) query.list();
		System.out.println("Get All Users " + users);
		hbsession.getTransaction().commit();
		hbsession.close();
		return users;

	}

	public SessionFactory getFactory() {
		return factory;
	}

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
