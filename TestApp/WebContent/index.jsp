<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Home</title>

<style> 
.card-body button{
width: 40%;
text-align: center;
margin:10px 0 10px 5%;
border-radius:4px;
}

.card-body{
padding : 10px;
margin : 20px;
}

body{
margin : 0px;
padding: 0px;
background-size: cover;
background-position: center;
background-color:#F0F0F0;
padding-top:0;
padding-bottom:10px;
}


.card-header{
font-weight:bold;
font-family: ;
text-align: center;
}

.row{
  margin: auto;
}

h1{
font-weight:bold ;
text-align: center;
padding:5%;
margin-bottom:2px;
font-size: 50px;
}

p{
  font-family: "Times New Roman", Times, serif;
  margin-left:5%;
}


</style>
</head>
<body>

<h1>SOAP WEB SERVICES</h1>

<div class = "row">
 
 <div class="col-md-4">
  <div class="card bg-light text-dark">
  <div class="card-header">Products</div>
    <div class="card-body">
    <p class="card-text text-muted">To Get Products, Click Get Button!</p>
    <div class="row">
     <button type="button" class="btn btn-primary" onclick="location.href='Product.jsp';">Get</button>
     <button type="button" class="btn btn-success" onclick="location.href='InsertProduct.jsp';">Create</button>
    </div>
    </div>
  </div>
</div>

<div class="col-md-4">
  <div class="card bg-light text-dark">
  <div class="card-header">Facility With Product</div>
    <div class="card-body">
    <p class="card-text text-muted">To Get Facility with Products, Click Get Button!</p>
    <div class = "row">
    <button type="button" class="btn btn-primary" onclick="location.href='ProductFacility.jsp';">Get</button> 
    <button type="button" class="btn btn-success" onclick="location.href='InsertProductFacility.jsp';">Create</button> 
    </div>
    
    </div>
  </div>
</div>

<div class="col-md-4">
  <div class="card bg-light text-dark">
  <div class="card-header">Supplier With Product</div>
    <div class="card-body">
    <p class="card-text text-muted">To Get Supplier with Products, Click Get Button!</p>
    <div class ="row">
     <button type="button" class="btn btn-primary" onclick="location.href='ProductSupplier.jsp';">Get</button> 
      <button type="button" class="btn btn-success" onclick="location.href='InsertProductSupplier.jsp';">Create</button> 
    </div>
   </div>
  </div>
</div>


</div>


</body>
</html>