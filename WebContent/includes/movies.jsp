<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		
		<c:choose>
			<c:when test="${empty movies }">
				<p>Sorry, there were no results.</p>
			</c:when>
			<c:otherwise>
				<c:forEach var="movie" items="${movies}">
					<div class="span4">
						<h2>${movie.title}</h2>
						<p>Director: ${movie.director}</p>
						<p>Length: ${movie.lengthInMinutes} minutes</p>
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>