/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Goshgar
 */
public class AbstarctDatabase {

    public Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "root";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
