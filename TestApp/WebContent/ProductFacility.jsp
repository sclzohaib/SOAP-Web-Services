<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ofbiz.facilitywithproduct.FacilityWithProductPortTypeProxy" %>
    <%@page import="com.ofbiz.facilitywithproduct.xsd.FacilityWithProductInput" %>
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

h2{
text-align: center;
font-weight: bold;
padding:2%;
}

th ,td{
 padding: 8px;
  text-align: center;
  border-bottom: 1px solid #ddd;
}

</style>

<title>Products Facility</title>
</head>


<body>
<h2>Products With Facility</h2>

<div class="table-responsive">
          
  <table class="table table-striped table table-hover table table-bordered">
  <thead class="thead-dark">
  <tr>
    <th>Product Name</th>
    <th>Minimum Stock</th>
    <th>Reorder Quantity</th>
    <th>Days To Ship</th>
    <th>Inventory Count</th>
    
  </tr>
  </thead>
  <tbody>
   <%
try{FacilityWithProductPortTypeProxy productFacility = new FacilityWithProductPortTypeProxy();

//System.out.println(productFacility.getFacilityWithProduct()[0].getProductName());
for(FacilityWithProductInput iProductFacility: productFacility.getFacilityWithProduct()) {
	
	out.println("<tr>");
	out.println("<td>");
	out.println(iProductFacility.getProductName()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductFacility.getMinimumStock()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductFacility.getReorderQuantity()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductFacility.getDaysToShip()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductFacility.getInventoryCount()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("</tr>");
}
}catch(Exception ex){}

%>
 </tbody>
</table>

</div>


</body>
</html>