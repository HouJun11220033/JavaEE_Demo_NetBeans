<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
     <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>JSP Page</title>
     </head>
     <body>
          <c:if test="${empty requestScope.employees}">
              没有任何员工信息 。
          </c:if>
          <c:if test="${!empty requestScope.employees}">
              <table border="1" cellpadding="10" cellspacing="0">
                   <tr>
                        <th>ID</th>
                        <th>LastName</th>
                        <th>Email</th>
                        <th>Gender</th>
                        <th>Department</th>
                        <th>Edit</th>
                        <th>Delete</th>


                   </tr>
                   <tr>
                        <td>${emp.id }</td>
                        <td>${emp.lastName }</td>
                        <td>${emp.email }</td>
                        <td>${emp.gender == 0 ? 'Female' : 'Male' }</td>
                        <td>${emp.department.departmentName }</td>
<!--                        <td><a href="emp/${emp.id}">Edit</a></td>
                        <td><a class="delete" href="emp/${emp.id}">Delete</a></td>-->

                   </tr>
              </table>

          </c:if>
          <br><br>
          <a href="emp">Add New Employee</a>

     </body>
</html>
