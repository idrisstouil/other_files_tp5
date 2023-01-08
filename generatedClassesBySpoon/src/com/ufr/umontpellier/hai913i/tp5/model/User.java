package com.ufr.umontpellier.hai913i.tp5.model;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import com.ufr.umontpellier.hai913i.tp5.utils.Utils;
import java.util.logging.Logger;
public class User {
    private static Logger LOGGER = Logger.getLogger(User.class.getName());

    private String ID;

    private String name;

    private String age;

    private String email;

    private String password;

    private UserService user;

    public User(String name, String age, String email, String password) {
        ID = Utils.generateRandomID();
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getID() {
        LOGGER.info("MethodeName : getID"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return ID;
    }

    public void setID(String iD) {
        LOGGER.info("MethodeName : setID"+";"+UserService.getUser().toString()+ ";" +iD.toString());
        ID = iD;
    }

    public String getName() {
        LOGGER.info("MethodeName : getName"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return name;
    }

    public void setName(String name) {
        LOGGER.info("MethodeName : setName"+";"+UserService.getUser().toString()+ ";" +name.toString());
        this.name = name;
    }

    public String getAge() {
        LOGGER.info("MethodeName : getAge"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return age;
    }

    public void setAge(String age) {
        LOGGER.info("MethodeName : setAge"+";"+UserService.getUser().toString()+ ";" +age.toString());
        this.age = age;
    }

    public String getEmail() {
        LOGGER.info("MethodeName : getEmail"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return email;
    }

    public void setEmail(String email) {
        LOGGER.info("MethodeName : setEmail"+";"+UserService.getUser().toString()+ ";" +email.toString());
        this.email = email;
    }

    public String getPassword() {
        LOGGER.info("MethodeName : getPassword"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return password;
    }

    public void setPassword(String password) {
        LOGGER.info("MethodeName : setPassword"+";"+UserService.getUser().toString()+ ";" +password.toString());
        this.password = password;
    }

    @Override
    public String toString() {
        return ((((((("User [ID=" + ID) + ", name=") + name) + ", age=") + age) + ", email=") + email) + "]";
    }
}