<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<!--iserrorpage还不能加上！！！-->
<!DOCTYPE html>
<html>
<body>

	<div>
		<%
		//	String name=request.getParameter("name");
			String name="侯鋆";
			Cookie c =new Cookie("username",java.net.URLEncoder.encode(name,"gbk"));
			c.setMaxAge(24*3600);
			response.addCookie(c);//增加Cookie交给response
		%>

	</div>
</body>
</html>
