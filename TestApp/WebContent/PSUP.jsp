<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.ofbiz.supplierwithproduct.GetSupplierWithProductPortTypeProxy" %>
    <%@page import="com.ofbiz.supplierwithproduct.xsd.SupplierWithProductInput" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
try{GetSupplierWithProductPortTypeProxy productSupplier = new GetSupplierWithProductPortTypeProxy();

//System.out.println(productFacility.getFacilityWithProduct()[0].getProductName());
for(SupplierWithProductInput iProductSupplier: productSupplier.getSupplierWithProduct()) {
	
	out.println("<tr>");
	out.println("<td>");
	out.println(iProductSupplier.getProductName()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("</tr>");
}
}catch(Exception ex){}

%>
</body>
</html>