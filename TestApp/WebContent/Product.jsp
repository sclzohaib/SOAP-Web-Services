<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.ofbiz.createproduct.CreateProductPortTypeProxy" %>
    <%@page import="com.ofbiz.createproduct.xsd.CreateProductInput" %>
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
<title>Products</title>
</head>
<body>
<h2>Products: </h2>
<table>
<tr>
    <th>Product Name</th>
  </tr>
  
  <%
try{CreateProductPortTypeProxy product = new CreateProductPortTypeProxy();
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

</body>
</html>