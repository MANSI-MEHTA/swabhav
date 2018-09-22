package com.techlabs.entity.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Actor;
import com.techlabs.entity.Movie;

public class EntityTest {

	public static void main(String args[]) {
		Actor actor1 = new Actor(10001, "varshil", 21, 3);
		Actor actor2 = new Actor(10002, "manoj", 21, 5);

		Movie movie1 = new Movie(101, "3 IDIOTS", "21/5/2016");
		Movie movie2 = new Movie(102, "xyz", "21/5/2017");
		Movie movie3 = new Movie(103, "ded", "21/5/2018");

		Set<Movie> actor1movies = new HashSet<Movie>();
		Set<Movie> actor2movies = new HashSet<Movie>();

		actor1movies.add(movie1);
		actor1movies.add(movie2);
		actor2movies.add(movie3);
		actor1.setMovies(actor1movies);
		actor2.setMovies(actor2movies);
		try {
			Configuration config = new Configuration();
			config.configure("hibernate-cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			Session hbsession = factory.getCurrentSession();

			hbsession.beginTransaction();
			hbsession.save(actor1);
			hbsession.save(actor2);
			hbsession.save(movie1);
			hbsession.save(movie2);
			hbsession.save(movie3);
			

						hbsession.getTransaction().commit();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}
}
