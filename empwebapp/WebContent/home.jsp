<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<<jsp:useBean id="info" class="com.ustglobal.empwebapp.dto.EmployeeInfo" scope="session"></jsp:useBean>

<title>Insert title here</title>
</head>
<body>
<a style="float:right;" href='./logout'>Logout</a>
<h1>Welcome  <%=info.getName()%> </h1>
		<a href='./search.html'>search</a>
		<a href='./changepassword.jsp'>change password</a>
		

</body>
</html>