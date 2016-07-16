<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<%@ page import="java.sql.*" %>
<!--iserrorpage还不能加上！！！-->
<!DOCTYPE html>
<html>
<body>

	<div>
		<%
				String dirver=application.getInitParameter("driver");
				String url=application.getInitParameter("url");
				String user=application.getInitParameter("user");
				String pass=application.getInitParameter("pass");

			 Class.forName("com.mysql.jdbc.Driver");
			 Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cs","root","root");
			 Statement stmt=conn.createStatement();
			 ResultSet rs=stmt.executeQuery("select * from teacher");

		 %>
		 <%while(rs.next())

		 	{%>
		 <table>
		 		<tr>
						<td><%=rs.getString(1)%></td>
						<td><%=rs.getString(2)%></td>
						<td><%=rs.getString(3)%></td>

						<!--fuck！！！ 注释特么也管？？？-->
				</tr>
		 </table>
		 <%}%>

	</div>
</body>
</html>
