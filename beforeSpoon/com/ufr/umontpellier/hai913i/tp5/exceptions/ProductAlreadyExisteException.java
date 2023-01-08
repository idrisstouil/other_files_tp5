package com.ufr.umontpellier.hai913i.tp5.exceptions;
import java.util.logging.Logger;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;

public class ProductAlreadyExisteException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

	private UserService user;

    public ProductAlreadyExisteException() {
    }

    public ProductAlreadyExisteException(String message) {
        super(message);
    }
}