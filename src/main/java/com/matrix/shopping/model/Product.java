package com.matrix.shopping.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    @JsonProperty(value = "name")
    private String name;
    private int price;
//    private String description;

    public  Product(){

    }
    public Product(String name, int price,String description) {
        this.name = name;
        this.price = price;
//        this.description=description;
    }

//    public String getDescription() {
//        return description;
//    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
//                ", description='" + description + '\'' +
                '}';
    }
}
