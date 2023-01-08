package com.ufr.umontpellier.hai913i.tp5.utils;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import java.util.UUID;
import java.util.logging.Logger;
public class Utils {
    private static Logger LOGGER = Logger.getLogger(Utils.class.getName());

    private UserService user;

    public static String generateRandomID() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }
}