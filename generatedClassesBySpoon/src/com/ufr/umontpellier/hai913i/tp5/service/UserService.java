package com.ufr.umontpellier.hai913i.tp5.service;
import com.ufr.umontpellier.hai913i.tp5.model.User;
import com.ufr.umontpellier.hai913i.tp5.utils.Utils;
import java.util.Scanner;
import java.util.logging.Logger;
public class UserService {
    private static Logger LOGGER = Logger.getLogger(UserService.class.getName());

    static Scanner sc = new Scanner(System.in);

    static User user = new User();

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        LOGGER.info("MethodeName : setUser"+";"+UserService.getUser().toString()+ ";" +user.toString());
        UserService.user = user;
    }

    public static User createUser() {
        System.out.println("name :");
        String nameUser = sc.nextLine();
        System.out.println("age :");
        String ageUser = sc.nextLine();
        System.out.println("email :");
        String emailUser = sc.nextLine();
        System.out.println("password :");
        String passwordUser = sc.nextLine();
        user.setID(Utils.generateRandomID());
        user.setName(nameUser);
        user.setAge(ageUser);
        user.setEmail(emailUser);
        user.setPassword(passwordUser);
        return user;
    }
}