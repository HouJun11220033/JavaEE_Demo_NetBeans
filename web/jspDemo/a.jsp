<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="error.jsp" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>
		Welcome!!!
	</title>
	<body>
	 HelloWorld !!!
	 <% out.println(new java.util.Date()); %>
	 <% for(int i=0;i<10;i++)
	 {
		out.println("<font size='" +i+ "'>");
		%>

	 哈哈哈哈!!!
	 </font>
	 <% } %>
	 <%!
		private int count=0;
		public String info()
		{
			return "Success!!!";
		}

	 %>
	 <% out.println(count++);
		out.println(info());
	 %>
	 <br/>
	 -------------------------------------------
	<%=count=10  %>
	<%=info() %>
	-----------脚本测试------------------

	<table bgcolor="red" border="1" width="300px">

	<% for(int i=0;i<10;i++)
	{

	%>
		<tr>
			<td>循环变量: </td>
			<td><%= i %></td>
		</tr>


	<% }%>
	</table>
	--------------------链接数据库--------------------
	<!--注册驱动-->
	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cs","root","root");
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("select * from teacher");

	%>
	<table color="blue" border="1" width="400px">
		<%
		while(rs.next())
		{ %>
		<tr>

				<td><%=rs.getString(1) %> </td>
				<td><%=rs.getString(2) %> </td>
				<td><%=rs.getString(3) %> </td>

		</tr>
		<%}%>


	</table>
	----------------------------编译指令info--------------------------------
	<%@page info="FUCK!!!!!"%>
	<div>
	<%= getServletInfo() %>
</div>
<%
 				int a=10;
				int b=0;
				int div=a/b;

 %>


 ------------------------include指令----------------------------------
 <%@include file="error.jsp"  %>



 <div>
<!-- 动作指令就不用加%了！！！！-->
	<jsp:forward page="forward-result.jsp">

		<jsp:param  name="age" value="29"/>


	</jsp:forward>
</div>
	</body>
</head>
</html>
