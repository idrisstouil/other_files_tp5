package com.ufr.umontpellier.hai913i.tp5.model;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;

import com.ufr.umontpellier.hai913i.tp5.utils.Utils;
public class User {

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
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return ((((((("User [ID=" + ID) + ", name=") + name) + ", age=") + age) + ", email=") + email) + "]";
    }
}