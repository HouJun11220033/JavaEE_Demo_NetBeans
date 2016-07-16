<%-- 
    Document   : online
    Created on : Jul 16, 2016, 12:55:18 AM
    Author     : Sammy Guergachi <sguergachi at gmail.com>
--%>

<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online</title>
    </head>
    <body>
        <%
            
            Map<String,String> online = (Map<String, String>) application.getAttribute("online");
            for (String sessionID : online.keySet()) {%>
    <tr>
        <td><%=sessionID%></td>
        <td><%=online.get(sessionID)%></td> 
    </tr>
    <%}%>

</body>
</html>
