package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String dbURL = "jdbc:mysql://127.0.0.1:3306/testdb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "markiz12";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbURL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}// реализуйте настройку соеденения с БД

