package edu.cvtc.web.view;

/**
 * @author Josh Prueher
 *
 */
public class NavView {

	public static String buildNavigation() {
		
		final StringBuilder out = new StringBuilder();
		
		out.append("\n\t\t<nav>\n\t\t\t<ul>\n\t\t\t\t<li><a href='home'>Home</a></li>\n\t\t\t\t"
				+ "<li><a href='movies'>Movies</a></li></br></br>\n\t\t\t\t"
				+ "<li><a href='SortByTitle'>Sort By Title</a></li>\n\t\t\t\t"
				+ "<li><a href='SortByDirector'>Sort By Director</a></li>\n\t\t\t\t"
				+ "<li><a href='SortByLength'>Sort By Length</a></li>\n\t\t\t\t"
				+ "<li><a href='Search'>Search</a></li>\n\t\t\t"
				+ "<li><a href='PopulateDatabase'>Populate</a></li>\n\t\t\t</ul>\n\t\t</nav>\n\t\t");
		
		return out.toString();
	}
	
}
