<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ofbiz.createproduct.CreateProductPortTypeProxy" %>
    <%@page import="com.ofbiz.createproduct.xsd.CreateProductInput" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
body{
margin : 40px;
padding: 20px;
background-size: cover;
background-position: center;
background-color:#F5F5F5;
padding-top:0;
padding-bottom:10px;

}
.container{
position: absolute;

}
h2{
text-align: center;
font-weight: bold;
padding:2%;

}
table{
margin-left: 5%;
border: 1px solid  ;
border-color: #000000;
width:100%;
border-collapse: collapse;
border-spacing: 5px;

}
th ,td{
 padding: 8px;
  text-align: center;
  border-bottom: 1px solid #ddd;
}
tr{
tr:hover {background-color:#f5f5f5;}
}
</style>
<title>Products</title>
</head>
<body>
<h2>Products</h2>


<div class="container">
          
  <table class="table table-striped table table-hover table table-bordered">
  <tr>
    <th>Product Name</th>
    
  </tr>
  
  <%
try{CreateProductPortTypeProxy product = new CreateProductPortTypeProxy();
//System.out.println(product.getProduct()[0].getProductName());
for(CreateProductInput iProduct: product.getProduct()) {
	
	out.println("<tr>");
	out.println("<td>");
	out.println(iProduct.getProductName()+"<br>");
	//System.out.println(iProduct.getProductName()+"<br>");
	out.println("</td>");
	out.println("</tr>");
}
}catch(Exception ex){}

%>
  
 
</table>
  
</div>




</body>
</html>