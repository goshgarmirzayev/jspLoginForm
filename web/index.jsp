<%-- 
    Document   : newjsp
    Created on : Dec 29, 2018, 4:38:26 PM
    Author     : Goshgar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <%
            String name = request.getParameter("username");
        %>
    </head>
    <body>
        <label style="position: absolute;right: 0px;top :0px;">Logined User:</label>
        <h3 style="position: absolute;right: 0px;top :0px;"><%=name%></h3>
        <form action="login.jsp">
            <input type="submit" value="Log in" />

        </form>

    </body>
</html>
