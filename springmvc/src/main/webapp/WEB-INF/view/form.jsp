<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./form" method="post">
<table>
<tr>
<td>Register</td>
</tr>
<tr>
<td>ID</td>	
<td><input type="number" name="id" ></td>
</tr>
<tr>
<td>NAME</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>PASSWORD</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>GENDER</td>
<td><input type="text" name="gender"></td>
</tr>
<tr>
<td>DOJ</td>
<td><input type="date" name="doj"></td>
</tr>
<tr>
<td><input type="reset" name="reset"></td>
<td><input type="submit" name="submit"></td>
</tr>

</table>

</form>

</body>
</html>