package com.ufr.umontpellier.hai913i.tp5.exceptions;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import java.util.logging.Logger;
public class ProductAlreadyExisteException extends Exception {
    private static Logger LOGGER = Logger.getLogger(ProductAlreadyExisteException.class.getName());

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private UserService user;

    public ProductAlreadyExisteException() {
        LOGGER.severe("MethodeName : ProductAlreadyExisteException"+";"+UserService.getUser().toString()+ ";" +"Constructor");
    }

    public ProductAlreadyExisteException(String message) {
        super(message);
        LOGGER.severe("MethodeName : ProductAlreadyExisteException"+";"+UserService.getUser().toString()+ ";" +"Constructor");
    }
}