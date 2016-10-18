<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>HOME</title>
</head>
<body>
	<h1> DICE GAME! </h1> <hr>
	<form action="/dicegame/play">
		<p>insert your name : <input type="text" name="id">
		<input type="submit" value="START GAME">
	</form>
	
	<p><a href="/dicegame/configure">CONFIGURE</a></p>
	
</body>
</html>
