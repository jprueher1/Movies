<!doctype html>
<html>
<head>
<title>Movie Search: Index</title>
<meta name="description" content="This is a page to populate the Movies database.">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="includes/styles.jsp" %>
</head>
<body>
<div class="container">
	<div class="hero-unit">
		<h1>Populate Database</h1>
	</div>
	<%@ include file="includes/navigation.jsp" %>	
	<div class="container">
		<form action="PopulateDatabase" method="post">
			<div class="form-group">
				<input type="submit" name="populate" value="Create!">
			</div> 
		</form>
	</div>
	<hr>
	<%@ include file="includes/footer.jsp" %>
</div>
<%@ include file="includes/scripts.jsp" %>
</body>
</html>