<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ofbiz.facilitywithproduct.FacilityWithProductPortTypeProxy" %>
    <%@page import="com.ofbiz.facilitywithproduct.xsd.FacilityWithProductInput" %>
<!DOCTYPE html>
<html>
<head>
<style>
table {
  width:10%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
</style>
<meta charset="ISO-8859-1">
<title>Products Facility</title>
</head>
<body>
<h2>Products With Facility: </h2>
<table>
<tr>
    <th>Product Name</th>
  
    <th>Minimum Stock</th>
  
    <th>Reorder Quantity</th>
  
  
    <th>Days To Ship</th>
  
  
    <th>Inventory Count</th>
  </tr>
  
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
  
</table>

</body>
</html>