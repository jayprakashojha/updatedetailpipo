<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title><c:set>JSP Tag Example</c:set></title>
   </head>

   <body>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <c:out value = "${salary}"/>
   </body>
</html>