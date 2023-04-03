package com.practice.bankApplication.service;

import java.sql.*;

public class UserService {

    public void getUserNames() {

        try {
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from sys.USERS";
            ResultSet rs = myStmt.executeQuery(sql);

            while (rs.next())
                System.out.println(rs.getString("FIRST_NAME") + " " + rs.getString("LAST_NAME"));

        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createUser(String firstName, String lastName, String email) {

    }
}
