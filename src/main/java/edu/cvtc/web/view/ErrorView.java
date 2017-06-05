package edu.cvtc.web.view;

/**
 * @author Josh Prueher
 *
 */
public class ErrorView {
	
	public static String buildHTML(final String errorMessage) {
		final StringBuilder out = new StringBuilder();
		
		out.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>Error Page</title>\n\t\t"
				+ "<link rel=\"stylesheet\" href=\"assets/stylesheets/styles.css\">\n\t</head>\n\t<body>");
		out.append(NavView.buildNavigation());
		out.append("<h1>Error Page</h1>\n");
		
		out.append("\n\t\t<p>" + errorMessage + "</p>");
		
		out.append("\t\t<footer>\n\t\t\t<p>&copy; Copyright 2016 Josh Prueher</p>\n\t\t</footer>\n\t</body>\n</html>");
		return out.toString();
	}

}
