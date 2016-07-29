<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
     <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Welcome to Spring Web MVC project</title>
     </head>

     <body>
          <form action="springmvc/testPojo" method="post">
               Username:<input type="text" name="username"/><br>
               Password<input type="password" name="password"/><br>
               E-mail<input type="text" name="email"/><br>
               Age:<input type="text" name="age"/><br>
               City:<input type="text" name="address.city"/><br>
               Province:<input type="text" name="address.province"/><br>
               <input type="submit" value="Submit"/><br>
          </form>
           <a href="springmvc/testMap">Test Map</a><br>
          <a href="springmvc/testPathVariable/123">Test PathVariable</a><br>
          <a href="springmvc/testAntPath/aaa/abc">Test AntPath</a><br>
          <a href="springmvc/testCookieValue">Test CookieValue</a><br>
          <a href="springmvc/testServletAPI">Test ServletAPI</a><br>
          <a href="springmvc/testModelAndView">Test ModelAndView</a><br>
          <a href="springmvc/testSessionAttribute">Test SessionAttribute</a><br>

     </body>
</html>
