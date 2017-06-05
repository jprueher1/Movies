<!doctype html>
<html>
<head>
<title>Movie Search: Add New Movie</title>
<meta name="description" content="This is a page that allows users to add a new movie to the database.">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Add Movie</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>
	<h3>Know of a movie we haven't listed and want others to see it? Add it here!</h3>	
	<div class="container">
		<form action="AddMovie">
			<label for="title"><Strong>Title:</Strong></label>
			<input name="title">
			<label for="director"><Strong>Director:</Strong></label>
			<input name="director">
			<label for="lengthInMinutes"><Strong>Length In Minutes:</Strong></label>
			<input name="lengthInMinutes">
			<input type="submit" value="Add Movie">
		</form>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>