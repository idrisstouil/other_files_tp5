package com.ufr.umontpellier.hai913i.tp5.utils;
import java.util.UUID;
import java.util.logging.Logger;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
public class Utils {
    
    	private UserService user;

    public static String generateRandomID() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }
}