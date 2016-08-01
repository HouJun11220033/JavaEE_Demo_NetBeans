<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
     <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Input Info</title>
     </head>
     <body>
          <form:form action="emp" modelAttribute="employee" method="POST"> 
              LastName: <form:input path="lastName"/><br>
              Email:<form:input path="email"/><br>
              <%
                  Map<String, String> genders = new HashMap();
                  genders.put("1", "Male");
                  genders.put("2", "Female");
                  request.setAttribute("genders", genders);


              %>
              Gender:<form:radiobuttons path="gender" items="${genders}"/><br>
              Department:<form:select path="department.id" items="${departments}" itemLabel="departmentName" itemValue="id"></form:select><br>
                  <input type="submit" value="Submit"/>
          </form:form>




     </body>
</html>
