<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<!--iserrorpage还不能加上！！！-->
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <body>

        <div>
            <%
                Enumeration<String> headerNames = request.getHeaderNames();
                while (headerNames.hasMoreElements()) {
                    String headerName = headerNames.nextElement();//headerName-头名字    getHeader-获取头名字所对应的信息
                    out.println(headerName + "-->" + request.getHeader(headerName) + "<br/>");
                }
                out.println("<hr/>");
                request.setCharacterEncoding("utf8");
                String name = request.getParameter("name");
                String gender = request.getParameter("gender");
                String[] color = request.getParameterValues("color");//getParameterValues
                String national = request.getParameter("country");
                byte[] rawBytes = national.getBytes("ISO-8859-1");

            %>
            您的名字:<%=name%><hr/>
            您的性别:<%=gender%><hr/>
            您喜欢的颜色:
            <%
                for (String c : color) {
                    out.println(c + " ");

                }

            %>

            <hr/>
            您来自的国家:<%=rawBytes%><!--随机的！-->
            <hr/>
        </div>
    </body>
</html>
