<!doctype html>
<html>
<head>
<title>Movie Search: Success</title>
<meta name="description" content="This is a page to show an error response page for when problems are encountered in the movie search site.">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Error</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>	
	<div class="container">
		<p>${error}</p>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>