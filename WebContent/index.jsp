<!doctype html>
<html>
<head>
<title>Movie Search: Index</title>
<meta name="description" content="This is a Movie Search website to allow users to search movies.">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>The Ultimate Movie List</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>	
	<div class="container">
		<h3>Welcome to the ultimate movie list page!</h3>
		<p>With our incredible search service you will never be bored again. Find something 
		to watch, any night of the week.</p>
		<p>If you know a movie that is a must see, simply go to our add movie page
		to add it to our list so our users can check it out!</p>
		<p>If you would like a fresh top 10 list, you can
		<a href="populateDatabase.jsp">click here</a>, to populate the database.</p>
	</div>
		<div class="moviePic">
		<img src="assets/img/movies.png">
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>