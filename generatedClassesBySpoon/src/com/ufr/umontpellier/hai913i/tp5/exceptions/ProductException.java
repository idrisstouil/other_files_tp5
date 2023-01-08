package com.ufr.umontpellier.hai913i.tp5.exceptions;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import java.util.logging.Logger;
public class ProductException extends Exception {
    private static Logger LOGGER = Logger.getLogger(ProductException.class.getName());

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private UserService user;

    public ProductException() {
        super();
        LOGGER.severe("MethodeName : ProductException"+";"+UserService.getUser().toString()+ ";" +"Constructor");
    }

    public ProductException(String message) {
        super(message);
        LOGGER.severe("MethodeName : ProductException"+";"+UserService.getUser().toString()+ ";" +"Constructor");
    }
}