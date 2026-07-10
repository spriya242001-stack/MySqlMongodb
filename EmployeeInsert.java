package com.example.EmployeeInsert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeInsert {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root1234@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            String sql = "INSERT INTO Employee VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            // Employee 1
            ps.setInt(1, 101);
            ps.setString(2, "Jenny");
            ps.setInt(3, 25);
            ps.setDouble(4, 10000);
            ps.executeUpdate();

            // Employee 2
            ps.setInt(1, 102);
            ps.setString(2, "Jacky");
            ps.setInt(3, 30);
            ps.setDouble(4, 20000);
            ps.executeUpdate();

            // Employee 3
            ps.setInt(1, 103);
            ps.setString(2, "Joe");
            ps.setInt(3, 20);
            ps.setDouble(4, 40000);
            ps.executeUpdate();

            // Employee 4
            ps.setInt(1, 104);
            ps.setString(2, "John");
            ps.setInt(3, 40);
            ps.setDouble(4, 80000);
            ps.executeUpdate();

            // Employee 5
            ps.setInt(1, 105);
            ps.setString(2, "Shameer");
            ps.setInt(3, 25);
            ps.setDouble(4, 90000);
            ps.executeUpdate();

            System.out.println("Records inserted successfully.");

            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
