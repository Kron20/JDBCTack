package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String dbURL = "jdbc:mysql://127.0.0.1:3306/testdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "markiz12";
    private static Connection connection = null;
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(dbURL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}// реализуйте настройку соеденения с БД

