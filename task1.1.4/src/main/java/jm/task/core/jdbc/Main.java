package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        final UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Alexandr","Serikov",(byte) 29);
        userService.saveUser("Andrey","Golubev",(byte) 34);
        userService.saveUser("Yaroslav","Kuznetcov",(byte) 35);
        userService.saveUser("Miroslav","Shestopal",(byte) 28);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}