<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  
<title>Add Product Supplier</title>
</head>

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

#snackbar {
  visibility: hidden;
  min-width: 250px;
  margin-left: -125px;
  background-color: #333;
  color: #fff;
  text-align: center;
  border-radius: 2px;
  padding: 16px;
  position: fixed;
  z-index: 1;
  left: 50%;
  bottom: 30px;
  font-size: 17px;
}

#snackbar.show {
  visibility: visible;
  -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
  animation: fadein 0.5s, fadeout 0.5s 2.5s;
}

@-webkit-keyframes fadein {
  from {bottom: 0; opacity: 0;} 
  to {bottom: 30px; opacity: 1;}
}

@keyframes fadein {
  from {bottom: 0; opacity: 0;}
  to {bottom: 30px; opacity: 1;}
}

@-webkit-keyframes fadeout {
  from {bottom: 30px; opacity: 1;} 
  to {bottom: 0; opacity: 0;}
}

@keyframes fadeout {
  from {bottom: 30px; opacity: 1;}
  to {bottom: 0; opacity: 0;}
}
</style>

<body>
<div class="form-style-8">
  <h2>Create Product Supplier</h2>
  <form>
  <div class = "row">
  <div class = "col-md-6">
  <label for="sel1">Supplier</label>
  <select class="form-control" id="sel1">
  	<option>Please Select</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
  </select>
  </div>
  <div class = "col-md-6">
  <label for="sel1">Currency Uom ID</label>
  <select class="form-control" id="sel1">
  	<option>American-Dollar-USD</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
  </select>
  </div>
  </div>
  
  <div class = "row">
  <div class = "col-md-6">
   <label for="sel1">Supplier Per Order ID</label>
  <select class="form-control" id="sel1">
  	<option>Main Supplier</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
  </select>
  </div>
 <div class = "col-md-6">
  <label for="sel1">Supplier Can Drop Ship</label>
  <select class="form-control" id="sel1">
  	<option>Please Select</option>
    <option>1</option>
    <option>2</option>
    <option>3</option>
    <option>4</option>
  </select>
  
  </div>
  
  </div>
 
 <div class = "row">
  <div class = "col-md-6">
   <label>Minimum Order Quantity</label>
    <input type="text" name="field1" placeholder="0" />
    </div>
  <div class = "col-md-6">
   <label>Available Through Date</label>
    <input type="date" name="field2" placeholder="" />
    </div>
  </div>

    <div class = "row">
  <div class = "col-md-6"> 
   <label>Supplier Product ID</label>
    <input type="text" name="field3" placeholder="Select" />
    </div>
   <div class = "col-md-6">
     <label>Last Price</label>
    <input type="text" name="field4" placeholder="$" />
    </div>
   </div>
   
 
   
     <div class = "row">
  <div class = "col-md-6"> 
   <label>Available From Date</label>
    <input type="date" name="field5" placeholder="" />
    </div>
  <div class = "col-md-6">
   <label>Comment</label>
    <textarea rows="4" cols="50" placeholder ="Comment here">
</textarea>
     </div>
  </div>
    
    <div id="snackbar">Submit Successfully!</div>
         
   <button type="button" class="btn btn-primary" onclick="myFunction()">CREATE</button>
   
   
   </form>
    
</div>
</body>.


<script>
function myFunction() {
  var x = document.getElementById("snackbar");
  x.className = "show";
  setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
}
</script>
</html>