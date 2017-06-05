package edu.cvtc.web.model;

/**
 * @author Josh Prueher
 *
 */
public class Movie {
	
	private String title;
	private String director;
	private Integer lengthInMinutes;
	
	public Movie(final String title, final String director, final Integer lengthInMinutes) {
		this.title = title;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public Integer getLengthInMinutes() {
		return lengthInMinutes;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", lengthInMinutes=" + lengthInMinutes + "]";
	}
	
}
