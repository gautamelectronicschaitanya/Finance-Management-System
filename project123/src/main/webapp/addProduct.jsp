<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<form action="addProduct.lti" method="post">
  <div class="container">
    <h1>Add Product</h1>
    <p>Please fill in the required product details.</p>
    <hr>
    <label for="PRODUCTID"><b>Product Id</b></label>
    <input type="number" maxlength="10" placeholder="Enter your product ID" name="productId" >

    <label for="PRODUCTNAME"><b>Product Name</b></label>
    <input type="text" maxlength="20" placeholder="Enter your product Name" name="productName" >

	<label for="PRODUCTDESC"><b>Product Description</b></label>
    <input type="text" maxlength="90" placeholder="Enter your product Description" name="productInfo">
    
    <label for="PRODUCTPRICE"><b>Product Price</b></label>
    <input type="number" maxlength="20" placeholder="Enter your product Price" name="productPrice">

    

	<label for="productImage">Product Image</label>
	<input type="file" id="productImage"/>
 	 </div>

    <button type="submit" value="addProduct" >Add Product</button>
</form>
</body>
</html>