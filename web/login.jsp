<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
     <head>
          <title>登录页面</title>
          <meta name="website" content="http://www.crazyit.org" />
     </head>
     <body>
          <h2>登录页面</h2>
          <!--删除jsp页面删彻底！！！-->

          ${tip}
          <s:form action="login">
               <s:textfield name="username" label="用户名"/>
               <s:password name="password" label="密码"/>
               <s:submit value="登录"/>
          </s:form>
     </body>
</html>