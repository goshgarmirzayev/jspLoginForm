<%-- 
    Document   : signUp
    Created on : Dec 31, 2018, 2:15:30 PM
    Author     : Goshgar Mirzayev
--%>

<%@page import="db.Database"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>

    <center>
        <h1>Welcome</h1>
        <form  method="post
               "action="index.jsp">
            <label>Username:</label>
            <br/>
            <input type="text" id="username" name="username"placeholder="username" required=""/>
            <br/><br/>
            <label>Password:</label>
            <br/>
            <input type="password" id="password" name="password"placeholder="password" required=""/>
            <br/><br/>
            <input type="submit" name="signup" value="Sign Up"/>
            <%
                if (request.getParameter("signup")!= null) {         
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    Database db = new Database();
                    db.registerUser(username, password);
                }

            %>
        </form>
    </center>
</body>
</html>
