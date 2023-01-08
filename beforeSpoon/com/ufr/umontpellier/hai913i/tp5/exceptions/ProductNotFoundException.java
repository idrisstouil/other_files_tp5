package com.ufr.umontpellier.hai913i.tp5.exceptions;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;

public class ProductNotFoundException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

	private UserService user;

    public ProductNotFoundException() {
        super();
    } 

    public ProductNotFoundException(String message) {
        super(message);
    }
}