<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.ofbiz.createproduct.CreateProductPortTypeProxy"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
   

  
  
<title>Add Product</title>

<style type = "text/css">
body{
margin : 40px;
padding: 20px;
background-size: cover;
background-position: center;
background-color:#F5F5F5;
padding-top:0;
padding-bottom:10px;
}
.form-style-8{
	font-family: 'Open Sans Condensed', arial, sans;
	width: 80%;
	padding: 30px;
	background: #FFFFFF;
	margin: 50px auto;
	box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);
	-moz-box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.22);
	-webkit-box-shadow:  0px 0px 15px rgba(0, 0, 0, 0.22);
}
.form-style-8 h2{
	background: #4D4D4D;
	text-transform: uppercase;
	font-family: 'Open Sans Condensed', sans-serif;
	color: #797979;
	font-size: 26px;
	font-weight: bold;
	padding: 20px;
	text-align: center;
	margin: -30px -30px 30px -30px;
}
.form-style-8 input[type="text"],
.form-style-8 input[type="date"],
.form-style-8 input[type="datetime"],
.form-style-8 input[type="email"],
.form-style-8 input[type="number"],
.form-style-8 input[type="search"],
.form-style-8 input[type="time"],
.form-style-8 input[type="url"],
.form-style-8 input[type="password"],
.form-style-8 textarea,
.form-style-8 select
{
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	outline: none;
	display: block;
	width: 100%;
	padding: 7px;
	border: none;
	border-bottom: 1px solid #ddd;
	background: transparent;
	margin-bottom: 10px;
	font: 16px Arial, Helvetica, sans-serif;
	height: 45px;
}
.form-style-8 button{
width: 40%;
margin:20px;
margin-left: 30%;
border-radius:6px;
padding-top:6px;
}
.form-style-8 label{
font: 16px Arial, Helvetica, sans-serif;
font-weight: bold;
}
</style>


</head>


<body>

<div class="form-style-8">
  <h2>Insert Product</h2>
  <form action="" method="POST">
  <label>Product ID</label>
    <input type="text" name="productId" placeholder="" />
  <label for="productTypeId">Product Type</label>
  <select class="form-control" id="productTypeId" name="productTypeId">
  	<option>Please Select</option>
    <option>DIGITAL_GOOD</option>
    <option>FINISHED_GOOD</option>
    
  </select>
    <label>Brand Name</label>
    <input type="text" name="brandName" placeholder="" />
  <label>Internal Name</label>
    <input type="text" name="internalName" placeholder="" />
         
   <button type="submit" name="submit" id="submit" value="CREATE" class="btn btn-primary">CREATE</button>
   
   <jsp:useBean id="u" class="com.ofbiz.createproduct.xsd.CreateProductInput"></jsp:useBean>
    <jsp:setProperty property="*" name="u"/>
   <%
   String x = request.getParameter("submit");
   if(x!= null && x.equalsIgnoreCase("CREATE")){
	   
   CreateProductPortTypeProxy product = new CreateProductPortTypeProxy();
   product.createProduct(u);
   System.out.println("Added Successfully");
 
   }
  
   %>
   </form>
    
</div>
  

</body>

</html>