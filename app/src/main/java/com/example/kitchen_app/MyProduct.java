package com.example.kitchen_app;


public class MyProduct {
    private String productName;
    private long productDate;

    public MyProduct(String productName, long productDate) {
        this.productName = productName;
        this.productDate = productDate;
    }


    public String getProductName() {
        return productName;
    }

    public long getProductDate() {
        return productDate;
    }
}
