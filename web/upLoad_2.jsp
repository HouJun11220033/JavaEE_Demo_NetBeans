<%-- 
    Document   : upLoad_2
    Created on : Jul 19, 2016, 12:08:20 AM
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
          <form action="upload2" method="post" enctype="multipart/form-data">
               <label for="myFile">Upload your file</label>
               <input type="file" name="myFile" />
               <input type="submit" value="Upload"/>
          </form>
     </body>
</html>
