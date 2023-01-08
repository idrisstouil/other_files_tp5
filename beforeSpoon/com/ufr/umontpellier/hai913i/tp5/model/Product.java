package com.ufr.umontpellier.hai913i.tp5.model;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;

public class Product {

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return ((((((("Product [ID=" + ID) + ", name=") + name) + ", price=") + price) + ", expirationDate=") + dateExpiration) + "]";
    }
}