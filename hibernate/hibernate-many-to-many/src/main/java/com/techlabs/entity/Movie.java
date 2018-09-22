package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {

	@Id
	@Column(name = "movie_id")
	private int movie_id;
	
	@Column(name = "movie_name")
	private String movie_name;
	
	@Column(name = "release_date")
	private String release_date;

	public Movie(int movie_id, String movie_name, String release_date) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.release_date = release_date;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	
	

}
