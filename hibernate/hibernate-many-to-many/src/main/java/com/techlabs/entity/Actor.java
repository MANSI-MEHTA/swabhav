	package com.techlabs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Actor")
public class Actor {

	@Id
	@Column(name = "actor_id")
	private int actior_id;
	@Column(name = "actor_name")
	private String actor_name;
	@Column(name = "age")
	private int age;
	@Column(name = "experience")
	private double experience;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Actor_Movie", joinColumns = { @JoinColumn(name = "actor_id") }, inverseJoinColumns = { @JoinColumn(name = "movie_id") })
	private Set<Movie> movies = new HashSet<Movie>();

	public Actor() {

	}

	public Actor(int actior_id, String actor_name, int age, double experience) {
		super();
		this.actior_id = actior_id;
		this.actor_name = actor_name;
		this.age = age;
		this.experience = experience;
	}

	public int getActior_id() {
		return actior_id;
	}

	public void setActior_id(int actior_id) {
		this.actior_id = actior_id;
	}

	public String getActor_name() {
		return actor_name;
	}

	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

}
