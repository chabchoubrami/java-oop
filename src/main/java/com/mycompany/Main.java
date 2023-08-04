package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Product 1", "Description 1", 100.0f, 10, 10.0f);
        product.display();
        product.setPrice(200.0f);
        Product product2 = new Product(product);
        product2.display();
    }
}
