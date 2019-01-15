<%-- 
    Document   : userlist
    Created on : Dec 30, 2018, 9:39:07 PM
    Author     : Goshgar
--%>

<%@page import="db.Database"%>
<%@page import="java.util.List"%>
<%@page import="bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Username</th>
                    <th>Password</th>
                    <th>Operation</th>
                </tr>
            </thead>
            <tbody>

                <%
                    Database db = new Database();
                    List<User> list = db.getAllUsers();
                    int i = 0;
                    for (User u : list) {
                        i++;
                %>
                <tr>
                    <td><%=i%></td>
                    <td><%=u.getUsername()%></td>
                    <td><%=u.getPassword()%></td>
                    <td><button>Edit</button><button>Delete</button></td>
                   
                    
                </tr>                    <%  }
                %>

            </tbody>
        </table>

    </body>
</html>
