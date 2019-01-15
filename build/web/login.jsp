<%-- 
    Document   : login
    Created on : Dec 29, 2018, 12:22:40 PM
    Author     : Goshgar
--%>

<%@page import="bean.User"%>
<%@page import="db.Database"%>
<%@page import="java.util.List"%>
<%@page import="servlet.MyServlet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script>
            var function getParameter(id) {
                return document.getElementById(id).value;
            }

        </script>
    </head>

    <center>
        <form method="post" id="loginForm" action="">
            <input type="text" id="username"name="username" placeholder="username"required=""/>
            <br/><br/>
            <input type="password" id="password" name="password" placeholder="password"/>
            <br/><br/>
            <input type="submit" value="Log In" name="login"/>
        </form>
        <form action="signUp.jsp">
            <input type="submit" value="Sign Up" name="login"/>
        </form>

        <%
            if (request.getParameter("login") != null) {

                Database db = new Database();
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                if (password == null) {
                    password = "";
                }

                User user = db.getUser(username, password);
                if (user != null) {
                    request.getRequestDispatcher("MyServlet").forward(request, response);;
                } else {
        %>

        <h1>Username or Password wrong please try again</h1>
        <%}
            }%>  

    </center>
</body>
</html>
