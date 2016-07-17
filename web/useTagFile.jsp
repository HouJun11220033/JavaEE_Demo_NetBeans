

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>tag file</title>
	<meta name="website" content="http://www.crazyit.org" />
</head>
<body>
	<h2>tag file</h2>
	<%
	
	List<String> a = new ArrayList<String>();
	a.add("hello");
	a.add("world");
	a.add("java");
	
	request.setAttribute("a" , a);
	%>
	
	<tags:iterator bgColor="#99dd99" cellColor="#9999cc" title="" bean="a" />
		
</body>
</html>