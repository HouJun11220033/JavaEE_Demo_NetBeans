<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<!--iserrorpage还不能加上！！！-->
<!DOCTYPE html>
<html>
<body>

	<div>
			<jsp:useBean name="p1" class="com.Person" scope="page">
				<jsp:setProperty name="p1" property="name" value="Houjun"/>
				<jsp:setProperty name="p1" property="age" value="99"/>
				<jsp:getProperty name="p1" property="name"/>
				<jsp:getProperty name="p1" property="age"/>
			</jsp:useBean>
	</div>
</body>
<html>
