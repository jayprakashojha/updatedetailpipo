<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
	
	
	<link rel="stylesheet" href="style.css">
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	
	
	</head>
	<style>    
table, th, td {    
border: 1px solid black;  
margin-left: auto;  
margin-right: auto;  
border-collapse: collapse;    
width: 300px;  
text-align: center;  
font-size: 15px;  
}    
</style>	
	<h5 align="center">Attendance Detail</h5>
	<h5 class="hello-title">${punchsuccess}</h5>
	<body>

		<form id="from2" action="punchout" method="post">
		<table>
		
		<tr><td><input type="button" id="btn2" name="panchin" value="PUNCH" /></td>
	
	
		<td><input type="submit" id="btn4" name="panchout" value="PUNCH OUT"/></td></tr>
		
		</table>
		</form>
		
	</body>
 <script>
 
		function fpunchbtn()
		{
	
	document.getElementById("btn2").style.visibility= 'hidden';

       }
		function fpunchout()
		{
		
			document.getElementById("btn2").style.visibility= 'hidden';
		}
	</script>
	 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  
   
	<script type="text/javascript">
	$(document).ready(function(){
	$("#btn2").click(function(){
		
		var form=$("#from2");
		var url=form.attr('action');
		$.ajax({
			type: "POST",
            url: "/punchinout",
            data: form.serialize(),
            success: function (response) {
                
                swal("Punch Successfully");
                fpunchbtn();
             
               
            },
            error: function (response) {
               
                
                swal("Not Punch In");

            }
        });
        return false;
    });
})
</script>
<script type="text/javascript">
	$(document).ready(function(){
	$("#btn4").click(function(){
		
		var form=$("#from2");
		var url=form.attr('action');
		$.ajax({
			type: "POST",
            url: "/punchout",
            data: form.serialize(),
            success: function (response) {
            	
                swal("Punch Out Successfully");
             
               
            },
            error: function (response) {
               
                
                swal("Not Punch Out");

            }
        });
        return false;
    });
})

	
	
	</script>
	
	
</html>