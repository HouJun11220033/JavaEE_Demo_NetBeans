<%@ page contentType="text/html; charset=utf-8" language="java"%>
<!DOCTYPE html>
<html>
<body>

	<div>

	<%! int i=0; %>
	<% application.setAttribute("counter",String.valueOf(i++));%>
	<%=i %>

	</div>
</body>
</html>
