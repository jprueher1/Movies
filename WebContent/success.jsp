<!doctype html>
<html>
<head>
<title>Movie Search: Success</title>
<meta name="description" content="This is a page to show a success message for actions performed in the movie search site.">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Success</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>	
	<div class="container">
		<p>${success}</p>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>