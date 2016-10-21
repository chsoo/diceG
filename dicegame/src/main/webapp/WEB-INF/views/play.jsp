<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>play</title>
</head>
<body>
	<h1>DICE GAME!</h1><hr>
	<p>
		ID : <input type="text" value="<%= request.getParameter("id")%>"> 
		<input type="text" value="${human}"> 
	<br>
		ID : <input type="text" value="AlphaGo"> 
	 	<input type="text" value="${alphago}">
	</p>
	
	<form method="get" class="roll-form">
		<input type="button" name="roll" value="ROLL!" onclick="location.reload()"> 
		
	</form>
</body>
</html>