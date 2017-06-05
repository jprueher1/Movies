<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<title>Movie Search: Movie List</title>
<meta name="description" content="This is a page to output every Movie in the database to a web page.">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Movie List</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>	
	<div class="container">
		<jsp:include page="includes/movies.jsp"></jsp:include>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>