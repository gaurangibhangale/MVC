package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private int movieid;

	private String name;
	private String director;
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	


}
