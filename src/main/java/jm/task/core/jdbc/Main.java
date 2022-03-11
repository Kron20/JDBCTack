package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private static final UserService userserv = new UserServiceImpl();

    public static void main(String[] args) {
        userserv.createUsersTable();
        userserv.saveUser("Alex", "Hoff", (byte) 25);
        userserv.saveUser("Tom", "Smith", (byte) 29);
        userserv.saveUser("John", "Fallen", (byte) 21);
        userserv.saveUser("Allan", "White", (byte) 34);
        System.out.println(userserv.getAllUsers());
        userserv.cleanUsersTable();
        userserv.dropUsersTable();
        Util.closeConnection();
        // реализуйте алгоритм здесь
    }
}
