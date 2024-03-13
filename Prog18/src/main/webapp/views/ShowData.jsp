<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
 
<head>
    <title>Home Page</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <style>
        #loadingDiv {
            width: 50%;
            height: 50%;
            top: 0px;
            left: 0px;
            position: fixed;
            display: block;
            opacity: 0.7;
            background-color: #fff;
            z-index: 99
        }

        #loading-image {
            position: absolute;
            top: 40%;
            left: 45%;
            z-index: 100
        }
    </style>
</head>

<body>
   
    <nav th:fragment="navbar" class="navbar navbar-expand-md bg-dark navbar-dark">
        <div class="container-fluid">
                   </div>
    </nav>
    <form id="sendOtpTrnForm" action="getSendOTPData" method="post">
        <div class="container-fluid">
            <h5>Employee Detail</h5>
           
        </div>
        
               

        <div class="container-fluid">
            <input type="button" id="btn7" value="show Detail"></input>
        </div>
        

        <div class="container-fluid" id="dbDateSendOtp">

        </div>
    </form>
    
    <script th:src="@{/webjars/bootstrap/4.0.0-2/js/bootstrap.min.js}"></script>
    <script th:src="@{https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js}"></script>
    <script th:src="@{https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap4.min.js}"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

    <script>
    
        function showlodder() {
            $('body').append('<div style="" id="loadingDiv"><img id="loading-image" src="./image/loading_big.gif" alt="Loading..." /></div>');
        }

        function hidelodder() {
            if ($("#loadingDiv").length > 0) {
                $("#loadingDiv").remove();
            }
        }

         $(document).ready(function(){
			 
            $("#btn7").click(function () {   //button name
               // showlodder();
                $("#dbDateSendOtp").html("");      //container name //table data khali kiya
                var form = $("#sendOtpTrnForm");   //acton
                var url = form.attr('action');
                $.ajax({
                    type: "POST",
                    url: "/getSendOTPData",
                    data: form.serialize(),
                    success: function (response) {
                        $("#dbDateSendOtp").html(response);  //
                        $('#dbDateSendOtpTable').dataTable();  //talbe name
                        swal("Successfully");
                        //hidelodder();
                    },
                    error: function (response) {
                      //  hidelodder();
                        // Some error in ajax call
                        swal("some Error");

                    }
                });
                return false;
            });
        })

        $(function () {
            $("#insert").click(function () {   //button name
               // showlodder();
               // $("#dbDateSendOtp").html("");      //container name //table data khali kiya
                var form = $("#sendOtpTrnForm1");  //form id //acton
                var url = form.attr('action');
                var person = new Object();
                 person.name = $('#txt1').val();
                 person.surname = $('#txt2').val();
                 
                $.ajax({
                    type: "POST",
                    url: "/insertdata",
                    data: form.serialize(),
                    success: function (response) {
                        //$("#dbDateSendOtp").html(response);  //
                        swal("Record inserted successfull");
                      //  $('#dbDateSendOtpTable').dataTable();  //talbe name
                       // hidelodder();
                    },
                    error: function (response) {
                      //  hidelodder();
                        
                        swal("some Error");

                    }
                });
                return false;
            });
        })

    </script>
     
</body>

</html>