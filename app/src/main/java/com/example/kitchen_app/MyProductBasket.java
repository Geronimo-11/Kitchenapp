package com.example.kitchen_app;

public class MyProductBasket {
    private String productName;
    private int id;
    public MyProductBasket( int id, String productName) {
        this.productName = productName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }
}
