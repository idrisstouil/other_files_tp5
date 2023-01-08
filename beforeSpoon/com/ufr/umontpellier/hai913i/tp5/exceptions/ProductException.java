package com.ufr.umontpellier.hai913i.tp5.exceptions;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;

public class ProductException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

	private UserService user;

    public ProductException() {
        super();
    }

    public ProductException(String message) {
        super(message);
    }
}