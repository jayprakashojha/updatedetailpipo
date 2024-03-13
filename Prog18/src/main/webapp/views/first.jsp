<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
		 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
		
	<style>
h1 {
  text-align: center;
}

h5 {
  text-align: center;
}
</style>
<style>    
table, th, td {    
border: 1px solid black;  
margin-left: auto;  
margin-right: auto;  
border-collapse: collapse;    
width: 300px;  
text-align: left;  
font-size: 15px;  
}    
</style>		
	
		<script th:src="@{/webjars/bootstrap/4.0.0-2/js/bootstrap.min.js}"></script>
    <script th:src="@{https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js}"></script>
    <script th:src="@{https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js}"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

		 
		
</head>
<div class="container1">
 <h1>LogIn</h1>
</div>	
<a href="Registration">Registration</a>
<body>

<h5 class="hello-title">${message}</h5>

<form id="login1" action="LogIn1" method="post">
				<table border="1">
				
					<tr><td>Mobile</td><td><input type ="tel" id="username" name="username" maxlength="10" min="10" pattern="[0-9]{10}" value="9893889778" required/></input></td></tr>
					<tr><td>Password</td><td><input type ="password" id="pwd" name="pwd" value="x9sphr6h76" required/> </td></tr>
				    <tr><td></td><td><input type="submit" value="Login" id="log" name="log"/></td></tr>
				
				</table>
			</form>

<form id="form1" action="send" method=post></form>



</body>
</html>