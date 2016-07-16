<%@ page contentType="text/html; charset=utf-8" language="java"  %>
<!--iserrorpage还不能加上！！！-->
<!DOCTYPE html>
<html>
    <body>

        <div>
            <%
                Cookie[] array = request.getCookies();
                for (Cookie c : array) {
                    if (c.getName().equals("username")) {

                        out.println(java.net.URLDecoder.decode(c.getValue()));

                    }
                }
            %>
        </div>
    </body>
</html>
