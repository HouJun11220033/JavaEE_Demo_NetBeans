<%@ page contentType="text/html; charset=utf-8" language="java"  %>

<!DOCTYPE html>
<html>
<body>

	<div>
		<%
			pageContext.setAttribute("page","Hello");//pageContext就是page对象方法
			pageContext.setAttribute("request1","Hello",pageContext.REQUEST_SCOPE);
			request.setAttribute("request2","Hello");
			pageContext.setAttribute("session1","Hello",pageContext.SESSION_SCOPE);
			session.setAttribute("session2","Hello");
			pageContext.setAttribute("application1","Hello",pageContext.APPLICATION_SCOPE);
			application.setAttribute("application2","Hello");

			out.println(pageContext.getAttributesScope("page"));
			out.println(pageContext.getAttributesScope("request1"));
			out.println(pageContext.getAttributesScope("request2"));
			out.println(pageContext.getAttributesScope("session1"));
			out.println(pageContext.getAttributesScope("session2"));
			out.println(pageContext.getAttributesScope("application1"));
			out.println(pageContext.getAttributesScope("application2"));

		%>


	</div>
</body>
</html>
