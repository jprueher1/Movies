package edu.cvtc.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.MovieDao;
import edu.cvtc.web.dao.impl.MovieDaoImpl;
import edu.cvtc.web.model.Movie;

/**
 * Servlet implementation class AddMovieController
 */
@WebServlet("/AddMovie")
public class AddMovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = null;
		
		
		try {
			final String title = request.getParameter("title");
			final String director = request.getParameter("director");
			final int lengthInMinutes = Integer.parseInt(request.getParameter("lengthInMinutes"));
			
			if (null != title && !title.isEmpty()
					&& null != director && !director.isEmpty()
					&& lengthInMinutes != 0) {
				
				final Movie movie = new Movie(title, director, lengthInMinutes);
				
				final MovieDao movieDao = new MovieDaoImpl();
				movieDao.insertMovie(movie);
				
				request.setAttribute("success", "Success, a new movie has been added to the database.");
				target = "success.jsp";
				
				
			} else {
				request.setAttribute("error", "Sorry, you must complete all fields with valid data to add a new movie to the database.");
				target = "error.jsp";
			}
			
		} catch (final Exception e) {
			e.printStackTrace();
			request.setAttribute("error", "Sorry, there was a problem adding this movie to the database.");
			target ="error.jsp";
		}
		
		request.getRequestDispatcher(target).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
