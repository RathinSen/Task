package com.task.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static String JDBC_CONNECTION_URL = "jdbc:mysql://localhost:3306/t_database";
    private static String JDBC_USERNAME = "root";
    private static String JDBC_PASSWORD = "12345";

/** This method will provide the database connection for mysql database */            

public static Connection getConnection() {
                Connection con = null;
                try {
                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection(JDBC_CONNECTION_URL,
                                                    JDBC_USERNAME, JDBC_PASSWORD);

                } catch (ClassNotFoundException e) {
                            e.getMessage();
                } catch (SQLException e) {
                            e.getMessage();
                }

                return con;
    }
}
