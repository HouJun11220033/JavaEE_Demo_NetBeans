<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<!--iserrorpage还不能加上！！！-->
<!DOCTYPE html>
<html>
<body>

	<div>
		<%
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");

			%>
			<%=name%>
			<%=gender%>

	</div>
</body>
</html>
