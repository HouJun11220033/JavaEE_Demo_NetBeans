<%-- 
    Document   : success
    Created on : Jul 27, 2016, 10:39:49 AM
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
          <h1>Hello World!</h1>
          Time: ${requestScope.time}
          <br>
          Names:${requestScope.names}
          <br>
          requestScope ${requestScope.user}
          <br>
           sessionScope ${sessionScope.user}
          
     </body>
</html>
