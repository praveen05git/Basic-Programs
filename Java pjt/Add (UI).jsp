<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body  bgcolor="#23E1E1">
<h1  align="center">Add Bank details</h1>
<form name="form1" method="post" action="RestaurentController">
<table border="0" align="center" width="40%">
<tr><td><label>MENU ID<font color="Red">*</font></label></td><td><input type="text" name="menuid" required></td></tr>
<tr><td><label>MENU NAME<font color="Red">*</font></label></td><td><input type="text" name="menuname" required></td></tr>
<fieldsset>
<tr>
<td><label>CATEGORY</label><label class="err">*</label>
</td>
<td>
<select name="category">
<option value="">Please select</option>
  <option value="Breakfast">BREAKFAST</option>
  <option value="lunch">LUNCH</option>
  <option value="snaks">SNAKS</option>
  <option value="dinner">DINNER</option>
</select>
</fieldsset>
<fieldsset>
<tr>
<td><label>TYPE</label><label class="err">*</label>
</td>
<td>
<select name="type">
<option value="">Please select</option>
  <option value="VEG">VEG</option>
  <option value="NON VEG">NON VEG</option>
</select>
</fieldsset>
<tr><td><label>COST<font color="Red">*</font></label></td><td><input type="text" name="cost" required></td></tr>
<fieldsset>
<tr>
<td><label>STATUS</label><label class="err">*</label>
</td>
<td>
<select name="status">
<option value="">Please select</option>
  <option value="available">AVAILABLE</option>
  <option value="non available">NON AVAILABLE</option>
</select>
</fieldsset>

<tr><td><input type="submit" value="create" name="action"></td><td><input type="reset" value="reset"></td></tr>
</body>
</center>

</html>
