package com.example.models;

import java.io.Serializable;

public class Product implements Serializable {
    private int ImgProduct;
    private String ProductName;
    private String ProductPrice;
    private String ProductRating;
    private String ProductRataNum;

    public Product(int imgProduct, String productName, String productPrice, String productRating, String productRataNum) {
        ImgProduct = imgProduct;
        ProductName = productName;
        ProductPrice = productPrice;
        ProductRating = productRating;
        ProductRataNum = productRataNum;
    }

    public int getImgProduct() {
        return ImgProduct;
    }

    public void setImgProduct(int imgProduct) {
        ImgProduct = imgProduct;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public String getProductRating() {
        return ProductRating;
    }

    public void setProductRating(String productRating) {
        ProductRating = productRating;
    }

    public String getProductRataNum() {
        return ProductRataNum;
    }

    public void setProductRataNum(String productRataNum) {
        ProductRataNum = productRataNum;
    }
}
