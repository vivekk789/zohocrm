<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create New Lead</h2>
	
	<form action="save" method="post">
	<pre>
	First Name <input type="text" name="firstName"/>
	Last Name  <input type="text" name="lastName"/>
	Email      <input type="text" name="email"/>
	Mobile     <input type="text" name="mobile"/>
	Source :   <select name="source">
		  <option value="radio">Radio</option>
		  <option value="News Paper">News paper</option>
		  <option value="Trade show">Trade show</option>
		  <option value="website">Web site</option>
		  </select>
		  
		
    	<input type="submit" value ="save"/>
	</pre>
	</form>
	

</body>
</html>