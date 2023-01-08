package com.ufr.umontpellier.hai913i.tp5.service;
import com.ufr.umontpellier.hai913i.tp5.exceptions.ProductAlreadyExisteException;
import com.ufr.umontpellier.hai913i.tp5.exceptions.ProductNotFoundException;
import com.ufr.umontpellier.hai913i.tp5.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ProductService {

    private static List<Product> products = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void initProducts() throws ProductAlreadyExisteException {
        Product p1 = new Product("1", "Bread", "1.99", "12/02/2023");
        Product p2 = new Product("2", "Pasta", "7.22", "10/02/2023");
        Product p3 = new Product("3", "Eggs pack of 6", "3.99", "01/06/2023");
        Product p4 = new Product("4", "Rice", "2.99", "01/12/2023");
        Product p5 = new Product("5", "Chicken", "9.66", "06/12/2023");
        addProduct(p1);
        addProduct(p2);
        addProduct(p3);
        addProduct(p4);
        addProduct(p5);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static int countProducts() {
        return products.size();
    }

    public static void setProducts(List<Product> products) {
        ProductService.products = products;
    }

    public static Product getProductById(String ID) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getID().equals(ID)) {
                return product;
            }
        }
        throw new ProductNotFoundException((" product with ID = " + ID) + "  not Found.");
    }
    


    public static Product addProduct(Product product) throws ProductAlreadyExisteException {
        try {
        	checkProductById(product.getID());
            throw new ProductAlreadyExisteException(("product with " + product.getID()) + " already found.");
        } catch (ProductNotFoundException e) {
            products.add(product);
            return product;
        }
    }

    public static Product deleteProduct(String ID) throws ProductNotFoundException {
        Product p = checkProductById(ID);
        products.remove(p);
        return p;
    }

    public static Product updateProduct(Product product) throws ProductNotFoundException, ProductAlreadyExisteException {
        checkProductById(product.getID());
        for (Product p : products) {
            if (p.getID().equals(product.getID())) {
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                p.setDateExpiration(product.getDateExpiration());
            }
        }
        return product;
    }

    public static List<Product> getAllProducts() {
        return products;
    }
    public static Product checkProductById(String ID) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getID().equals(ID)) {
                return product;
            }
        }
        throw new ProductNotFoundException((" product with ID = " + ID) + "  not Found.");
    }
}