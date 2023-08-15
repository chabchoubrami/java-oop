// Lean Java Constructor

package com.mycompany;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;

//    public Product(){} // default constructor:

    public Product() {
        this.name = "No name";
        this.description = "No description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }

    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public Product(Product product) { // Product product2 = new Product(product)
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
        this.quantity = product.quantity;
        this.discount = product.discount;
    }

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Constructor with 2 arguments");
    }

    public Product(String name, String description, String color) {
        this (name, description); // contructor chaining
        this.color = color;
        System.out.println("Constructor with 3 arguments");
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Discount: " + this.discount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
