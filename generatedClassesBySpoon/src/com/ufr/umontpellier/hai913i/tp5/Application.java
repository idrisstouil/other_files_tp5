package com.ufr.umontpellier.hai913i.tp5;
import com.ufr.umontpellier.hai913i.tp5.exceptions.ProductAlreadyExisteException;
import com.ufr.umontpellier.hai913i.tp5.exceptions.ProductNotFoundException;
import com.ufr.umontpellier.hai913i.tp5.model.Product;
import com.ufr.umontpellier.hai913i.tp5.service.ProductService;
import com.ufr.umontpellier.hai913i.tp5.service.UserService;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {
    private static Logger LOGGER = Logger.getLogger(Application.class.getName());

    static Scanner sc = new Scanner(System.in);

    boolean logged = false;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("A simple CLI application!");
        initSession();
        sc = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("********************");
            System.out.println("choose 1 to display all products");
            System.out.println("choose 2 to  fetch a product by its ID");
            System.out.println("choose 3 to add a new product");
            System.out.println("choose 4 to delete a product by its ID");
            System.out.println("choose 5 to update a product’s info");
            System.out.println("choose 0 quit");
            System.out.println("********************");
            input = sc.nextLine();
            System.out.println("********************");
            switch (input) {
                // display products in a repository, where every product has an ID, a name, a price, and a expiration date.
                case "1" :
                    {
                        List<Product> products = ProductService.getAllProducts();
                        System.out.println(products.size() + "products found in database :");
                        System.out.println();
                        for (Product p : products) {
                            System.out.println(p);
                        }
                        System.out.println("********************");
                        break;
                    }
                    // fetch a product by its ID
                case "2" :
                    {
                        System.out.println("Product ID :");
                        String id = sc.nextLine();
                        try {
                            Product p = ProductService.getProductById(id);
                            System.out.println(p);
                        } catch (ProductNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    // add a new product
                case "3" :
                    {
                        System.out.println("Product ID :");
                        String idProduct = sc.nextLine();
                        System.out.println("Product name :");
                        String nameProduct = sc.nextLine();
                        System.out.println("Product price :");
                        String priceProduct = sc.nextLine();
                        System.out.println("Product expiration date :");
                        String dateString = sc.nextLine();
                        try {
                            Product p = new Product(idProduct, nameProduct, priceProduct, dateString);
                            System.out.println(ProductService.addProduct(p));
                        } catch (ProductAlreadyExisteException e) {
                            System.out.println("Exception : ");
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    // delete a product by its ID
                case "4" :
                    {
                        System.out.println("ID :");
                        String id = sc.nextLine();
                        try {
                            System.out.println(ProductService.deleteProduct(id));
                        } catch (ProductNotFoundException e) {
                            System.out.println("Exception : ");
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    // update a product’s info
                case "5" :
                    {
                        System.out.println("Product ID :");
                        String idProduct = sc.nextLine();
                        System.out.println("Product name :");
                        String nameProduct = sc.nextLine();
                        System.out.println("Product price :");
                        String priceProduct = sc.nextLine();
                        System.out.println("Product expiration Date :");
                        String dateString = sc.nextLine();
                        try {
                            Product p = new Product(idProduct, nameProduct, priceProduct, dateString);
                            System.out.println(ProductService.updateProduct(p));
                        } catch (ProductNotFoundException | ProductAlreadyExisteException e) {
                            System.out.println("Exception : ");
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                case "0" :
                    {
                        return;
                    }
                default :
                    System.err.println("menu input not in the list, please try other value");
            }
        } while (!input.equals("0") );
        sc.close();
    }

    private static void initSession() {
        LOGGER.info("MethodeName : initSession"+";"+UserService.getUser().toString()+ ";" +"no parameters given");
        System.out.println("Create a new account : ");
        UserService.createUser();
        System.out.println("Account Created.");
        try {
            ProductService.initProducts();
        } catch (ProductAlreadyExisteException e) {
        }
    }
}