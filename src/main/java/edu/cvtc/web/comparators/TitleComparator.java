package edu.cvtc.web.comparators;

import java.util.Comparator;

import edu.cvtc.web.model.Movie;

/**
 * @author Josh Prueher
 *
 */
public class TitleComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getTitle().compareTo(m2.getTitle());
	}

}
