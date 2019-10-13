<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.ofbiz.supplierwithproduct.GetSupplierWithProductPortTypeProxy" %>
    <%@page import="com.ofbiz.supplierwithproduct.xsd.SupplierWithProductInput" %>
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

<title>Product Supplier</title>
</head>

<body>
<h2>Product With Supplier</h2>

<div class="table-responsive">
          
  <table class="table table-striped table table-hover table table-bordered">
  <thead class="thead-dark">
  <tr>
    <th>Product Name</th>
    <th>AVAILABLE FROM DATE</th>
    <th>AVAILABLE THRU DATE</th>
    <th>SUPPLIER PREF ORDER ID</th>
    <th>SUPPLIER RATING TYPE ID</th>
    <th>STANDARD LEAD TIME DAYS</th>
    <th>MINIMUM ORDER QUANTITY</th>
    <th>ORDER QTY INCREMENTS</th>
    <th>UNITS INCLUDED</th>
    <th>QUANTITY UOM ID</th>
    <th>AGREEMENT ID</th>
    <th>AGREEMENT ITEM SEQ ID</th>
    <th>LAST PRICE</th>
    <th>SHIPPING PRICE</th>
    <th>CURRENCY UOM ID</th>
    <th>SUPPLIER PRODUCT NAME</th>
    <th>SUPPLIER PRODUCT ID</th>
    <th>CAN DROP SHIP</th>
    <th>COMMENTS</th>
  </tr>
  </thead>
  <tbody>
  <%
try{GetSupplierWithProductPortTypeProxy productSupplier = new GetSupplierWithProductPortTypeProxy();

//System.out.println(productFacility.getFacilityWithProduct()[0].getProductName());
for(SupplierWithProductInput iProductSupplier: productSupplier.getSupplierWithProduct()) {
	
	out.println("<tr>");
	out.println("<td>");
	out.println(iProductSupplier.getProductName()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getAvailableFromDate()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getAvailableThruDate()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getSupplierPerfOrderId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getSupplierRatingTypeId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getStandardLeadTimeDays()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getMinimumOrderQuantity()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getOrderQtyIncrements()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getUnitsIncluded()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getQuantityUomId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getAgreementId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getAgreementItemSeqId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getLastPrice()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getShippingPrice()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getCurrencyUomId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getSupplierProductName()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getSupplierProductId()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getCanDropShip()+"<br>");
	//System.out.println(iProductFacility.getProductName()+"<br>"+"hello");
	out.println("</td>");
	
	out.println("<td>");
	out.println(iProductSupplier.getComments()+"<br>");
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