package com.example.models;

public class CartProduct {
    private int productThumb;
    private int productNumber;
    private String productName;
    private double productPrice;

    public CartProduct(int productThumb, int productNumber, String productName, double productPrice) {
        this.productThumb = productThumb;
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(int productThumb) {
        this.productThumb = productThumb;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
