<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="go"> 
<input type="text" name="username"/>
<input type="text" name="password"/>
<a:textfield label="Enter UserName" name="username"></a:textfield>
<a:password label="Enter the password" name="password"></a:password>
<input type="submit" value="Submit"/>
</form>
</body>
</html>