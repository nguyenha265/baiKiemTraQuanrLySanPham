package com.company.model;

public class Product {
    private String name;
    private int id;
    private int price;
    private String description;

    public Product() {
    }

    public Product(String name, int id, int price, String description) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product " +  "name= " + name  +
                ", id=" + id +
                ", price=" + price +
                ", description= " + description ;
    }
}
