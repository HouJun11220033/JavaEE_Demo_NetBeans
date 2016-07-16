<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<%@ page import="java.util.*" %>

<!--iserrorpage还不能加上！！！-->
<!DOCTYPE html>
<html>
<body>

	<div>
		<%
		String bal=request.getParameter("balance");
		double money=Double.parseDouble(bal);
			if(money<500)
			{

				out.println("您取了"+money+"块");
			}else
			{
				List<String> array=new ArrayList<String>();
				array.add("111");
				array.add("222");
				array.add("333");
				request.setAttribute("array",array);


		%>
		<jsp:forward page="second.jsp"/>


	<%}%>
	</div>
</body>
</html>
