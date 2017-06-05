package edu.cvtc.web.view;

import java.util.List;

import edu.cvtc.web.model.Movie;

/**
 * @author Josh Prueher
 *
 */
public class MoviesView {
	
	public static String buildHTML(final List<Movie> movies) {
		
		final StringBuilder out = new StringBuilder();
		
		out.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>Movie List</title>\n\t\t"
				+ "<link rel=\"stylesheet\" href=\"assets/stylesheets/styles.css\">\n\t</head>\n\t<body>");
		out.append(NavView.buildNavigation());
		out.append("<h1>Movie List</h1>");
		
		if (movies.isEmpty()) {
			out.append("\n\t\t\t<p>Sorry, we were unable to find any movies for that search.</p>");
		} else {
			for (final Movie movie : movies) {
				
				out.append("\t\t<div class=\"movie\">\n\t\t\t<h2>" + movie.getTitle() + "</h2>");
				out.append("\n\t\t\t<p>Director: " + movie.getDirector() + "</p>");
				out.append("\n\t\t\t<p>Length: " + movie.getLengthInMinutes() + " Minutes</p>\n\t\t</div>\n");
				
			}
				
		}
		
		out.append("\n\t\t<footer>\n\t\t\t<p>&copy; Copyright 2016 Josh Prueher</p>\n\t\t</footer>\n\t</body>\n</html>");
		
		return out.toString();
	}
}
