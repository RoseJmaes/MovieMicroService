package com.rose.maverik.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="movie")
public class Movie {

	@Id	
	public String imdbID;
    public String title;
    public String year;
    public  String rated;
    public  String released;
    public  String runtime;
    public  String genre;
    public  String director;
    public  String actors;
    public  String plot;
    public  String language;
    public  String country;
    public String poster;
    public  String imdbRating;
    public  String owner;
	
	    public String getImdbID() {
		return imdbID;
		
		
		
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public  String getRated() {
		return rated;
	}
	public void setRated( String rated) {
		this.rated = rated;
	}
	public  String getReleased() {
		return released;
	}
	public void setReleased( String released) {
		this.released = released;
	}
	public  String getRuntime() {
		return runtime;
	}
	public void setRuntime( String runtime) {
		this.runtime = runtime;
	}
	public  String getGenre() {
		return genre;
	}
	public void setGenre( String genre) {
		this.genre = genre;
	}
	public  String getDirector() {
		return director;
	}
	public void setDirector( String director) {
		this.director = director;
	}
	public  String getActors() {
		return actors;
	}
	public void setActors( String actors) {
		this.actors = actors;
	}
	public  String getPlot() {
		return plot;
	}
	public void setPlot( String plot) {
		this.plot = plot;
	}
	public  String getLanguage() {
		return language;
	}
	public void setLanguage( String language) {
		this.language = language;
	}
	public  String getCountry() {
		return country;
	}
	public void setCountry( String country) {
		this.country = country;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public  String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating( String imdbRating) {
		this.imdbRating = imdbRating;
	}
	public  String getOwner() {
		return owner;
	}
	public void setOwner( String owner) {
		this.owner = owner;
	}
		
	}





