<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<body>

	<div>
		<%
		String bal=request.getParameter("balance");
		double money=Double.parseDouble(bal);
		List<String> array2 =(List<String>)request.getAttribute("array");
		//需要重新起一个集合名！！！

		for(String tmp : array2)
		{
			out.println(tmp);
		}
		out.println(money);

		%>

	</div>
</body>
</html>
