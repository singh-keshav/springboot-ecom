package com.ecom.backend.model;

public class Product {
    public int prodId;
    public   String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

//    public int getProdId() {
//        return prodId;
//    }
//
//    public String getProdName() {
//        return prodName;
//    }
//
//    public int getPrice() {
//        return price;
//    }
}
