/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Goshgar
 */
public class Database {

    AbstarctDatabase db = new AbstarctDatabase();

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        try (Connection conn = db.connect()) {
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("select *from user");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                list.add(new User(username, password));

            }

        } catch (Exception e) {
        }

        return list;
    }

    public User getUser(String username, String password) {

        try (Connection conn = db.connect()) {
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("select *from user where username=? and password=?");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                User user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }

        } catch (Exception e) {
        }

        return null;
    }

    public boolean registerUser(String username, String password) {
        try (Connection conn = db.connect()) {
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement("insert into user (username,password) values(?,?);");
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

}
