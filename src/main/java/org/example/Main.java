package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {


        Connection dbConnection;

        try {
            String url_my_sql = "jdbc:mysql://localhost:3306/sys";
            String url_postgres_sql = "jdbc:postgresql://localhost:5432/devdb";
            String url_mongo = "jdbc:mongodb://localhost:27017/System";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url_my_sql);

            if (dbConnection != null && dbConnection.isValid(10)) {
                System.out.println("Successfully connected to MySQL database test");
            }

        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }
    }
}