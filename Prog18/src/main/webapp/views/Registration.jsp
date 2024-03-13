<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">

	<head>
		<meta charset="ISO-8859-1">
		<title>Document Manager</title>
		<link rel="stylesheet" href="style.css">
		 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
		 <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
		 <link  href="../Jquery/jquery.multiselect.css" rel="stylesheet"/>
         <link  href="../Jquery/style.css" rel="stylesheet" />
          <link  href="../Jquery/prettify.css" rel="stylesheet" />
		<link th:rel="stylesheet" th:href="@{/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css} " />
    <link th:rel="stylesheet" th:href="@{https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap4.min.css} "/>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
	

		</head>
	<body>
		<a href="LogIn1">Login</a>
		
	<form id="register" action="upload" id="register"
    th:object="${upload}" method="post"
    enctype="multipart/form-data"
    
			style="max-width: 700px;margin: auto;" 
			 class="border rounder m-3">
				<div><h2>Profile Creation</h2></div>
			<div class="container">	
				<table>
	<tr><td>First Name</td><td>Middle Name</td><td>LastName</td> </tr>
	<tr><td><input type="text" name="fname" id="txt1" required></input></td><td><input type="text" name="middle" id="txt2">&nbsp</input></td><td><input type="text" name="last" id="txt3" required></input></td></tr>
	<tr><td>Mobile Number</td><td>Date of Birth</td><td>Email Id</td> </tr>
	<tr><td><input type="tel" id="phone" name="phone" min="10" maxlength="10" onkeypress="return onlyNumberKey(event)" required />&nbsp</input></td><td><input type="date" id="dob" name="dob" required/></input></td><td><input type="email" id="email" name="email" pattern="[a-z0-9._%+\-]+@[a-z0-9.\-]+\.[a-z]{2,}$" required/></input></td></tr>
   	<tr><td>Cast Category</td><td>Specially Disability</td><td>Kind Disability</td> </tr>
	<tr><td>
  <select name="category" id="category">
  <option value="general">General</option>
  <option value="Obc">Obc</option>
  <option value="Sc">Sc</option>
  <option value="ST">St</option>
  </select>
  </td><td>
  <select name="spab" id="spab">
  <option value="No">No</option>
  <option value="Yes">Yes</option>
  </select>
  </td><td><input type="text" name="kd" id="kd"></input></td></tr>
	<tr><td>State</td><td>District</td><td>Address</td> </tr>
	<tr><td><select name="state" id="state">
    <option value="Madhya Pradesh">Madhya Pradesh</option>
    <option value="Up">Uttar Pradesh</option>
    </select></td><td><select name="district" id="district">
    <option value="Bhopal">Bhopal</option>
    <option value="Guna">Guna</option>
    </select></td><td><input type="text" name="address" id="address"></input></td></tr>
	<tr><td>City</td><td>Pincode</td> </tr>
	<tr><td><input type="text" name="city" id="city" required></input></td><td><input type="text" name="pincode" id="pincode" minlength="6" maxlength="7" onkeypress="return onlyNumberKey(event)" required /></input></td></tr>
	
	</table>
	</div>
	
	<p><br></br></p>
	
	<p><h4>Documents Detail</h4></p>
		
	<div class="container">
	<table align="center">
		<tr><td>Document Type</td><td>Document Number</td><td>Document</td></tr>
		<tr><td><select name="documenttype" id="documenttype">
    <option value="PAN CARD">PAN CARD</option>
    <option value="ADHAR CARD">ADHAR CARD</option>
    </select></td>
    <td><input type="number" name="dn" id="dn" ></input></td>		
				
					
				
				
				<td><input type="file" name="document" id="document" required /></td></tr></table></div>
				<div class="container">
					
				<p><input type="submit" id="btn9" value="Submit" class="btn"/></p></div>
				<h5 class="hello-title">${success}</h5>
				<a href="ShowData">ShowData</a>
				<div class="popup" id="popup">
					<img src=tick.png>
					<h2>OK</h2>
					<p>Your Data Sucess fully Submit</p>
					<input type="button" height="10px" width="30" value="OK" onclick="closePopup()">
					
					
					
				</div>
				</form>
				<p><br></br></p>
			
		
		
		<script>

			
			let popup=document.getElementById("popup");
			function openPopup(){
				
		  if(document.getElementById("txt1").value.trim() == "") 
		  {
				alert("Please Enter First Name Detail");
				return false;
		  }
			 if(document.getElementById("txt3").value.trim() == "") 
		  {
				alert("Please Enter Last Name Detail");
				return false;
		  }	
		   if(document.getElementById("phone").value.trim() == "") 
		  {
				alert("Please Enter Mobile Number Detail");
				return false;
		  }
		  if(document.getElementById("dob").value.trim() == "") 
		  {
				alert("Please Select Date Of Birth Detail");
				return false;
		  }
		  if(document.getElementById("email").value.trim() == "") 
		  {
				alert("Please Enter Email Id Detail");
				return false;
		  }
		   if(document.getElementById("documenttype").value.trim() == "") 
		  {
				alert("Please Enter Document Number Id Detail");
				return false;
		  }
		  
		   if(document.getElementById("document").value.trim() == "") 
		  {
				alert("Please Enter Document File Number Id Detail");
				return false;
		  }
		 
			else
			{
				
				popup.classList.add("open-popup");
			}}
			
			function closePopup(){
				popup.classList.remove("open-popup");
				
			}
		</script>
		
		<script>
        function onlyNumberKey(evt) {
             
            // Only ASCII character in that range allowed
            var ASCIICode = (evt.which) ? evt.which : evt.keyCode
            if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
                return false;
            return true;
        }
    </script>
    <script src="https://code.jquery.com/jquery-3.7.1.js" >
    
    </script>
    <script src="sweetalert2.all.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<!-- DataTables library -->
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
     
     
    
	</body>
	
	
</html>