<%-- 
    Document   : login
    Created on : Jul 14, 2016, 9:21:49 AM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <span>
            <%
                if (request.getAttribute("err") != null) {
                    System.out.println(request.getAttribute("err") + "</br>");

                }

            %>

        </span>
        <form method="post" id="login" action="loginServlet">
            Username:<input type="text" name="username"/></br>
            Password:<input type="password" name="pass"/></br>
            <input type="submit" value="Login"></br>

        </form>

    </body>
</html>
