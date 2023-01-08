package com.ufr.umontpellier.hai913i.tp5.exceptions;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import java.util.logging.Logger;
public class ProductNotFoundException extends Exception {
    private static Logger LOGGER = Logger.getLogger(ProductNotFoundException.class.getName());

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private UserService user;

    public ProductNotFoundException() {
        super();
        LOGGER.severe("MethodeName : ProductNotFoundException"+";"+UserService.getUser().toString()+ ";" +"Constructor");
    }

    public ProductNotFoundException(String message) {
        super(message);
        LOGGER.severe("MethodeName : ProductNotFoundException"+";"+UserService.getUser().toString()+ ";" +"Constructor");
    }
}