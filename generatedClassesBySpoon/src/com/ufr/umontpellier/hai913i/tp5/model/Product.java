package com.ufr.umontpellier.hai913i.tp5.model;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import java.util.logging.Logger;
public class Product {
    private static Logger LOGGER = Logger.getLogger(Product.class.getName());

    private String ID;

    private String name;

    private String price;

    private String dateExpiration;

    private UserService user;

    public Product(String id, String name, String price, String dateExpiration) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.dateExpiration = dateExpiration;
    }

    public Product() {
        super();
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

    public String getPrice() {
        LOGGER.info("MethodeName : getPrice"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return price;
    }

    public void setPrice(String price) {
        LOGGER.info("MethodeName : setPrice"+";"+UserService.getUser().toString()+ ";" +price.toString());
        this.price = price;
    }

    public String getDateExpiration() {
        LOGGER.info("MethodeName : getDateExpiration"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        LOGGER.info("MethodeName : setDateExpiration"+";"+UserService.getUser().toString()+ ";" +dateExpiration.toString());
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return ((((((("Product [ID=" + ID) + ", name=") + name) + ", price=") + price) + ", expirationDate=") + dateExpiration) + "]";
    }
}