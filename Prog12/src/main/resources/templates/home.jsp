<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>
<h1>This is home page</h1>
<c:set var="salary" scope="session" value="${salary}"}>msg</c:set>
<c:out value="${salary}"/>

</body>
</html>