<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <%!
    public void jspInit(){
    	System.out.println("jsp init");
    }
    
    %>
    <%!
    public void jspDestroy(){
    	System.out.println("jsp destroy");
    	
    }
    %>
<%
Date date = new Date();


%>




<body>
<h1 style ="color:green;">Data and Time is<%=date%></h1>


</body>
</html>