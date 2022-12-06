package com.example.models;

public class ItemDetail {
    private int ImgProductDetail;
    private String ProductDetailName;
    private String ProductDetailPrice;
    private String ProductDetailDescript;
    private String ProductDetailFunction;
    private String ProductDetailH2U;

    public ItemDetail(int imgProductDetail, String productDetailName, String productDetailPrice, String productDetailDescript, String productDetailFunction, String productDetailH2U) {
        ImgProductDetail = imgProductDetail;
        ProductDetailName = productDetailName;
        ProductDetailPrice = productDetailPrice;
        ProductDetailDescript = productDetailDescript;
        ProductDetailFunction = productDetailFunction;
        ProductDetailH2U = productDetailH2U;
    }

    public int getImgProductDetail() {
        return ImgProductDetail;
    }

    public void setImgProductDetail(int imgProductDetail) {
        ImgProductDetail = imgProductDetail;
    }

    public String getProductDetailName() {
        return ProductDetailName;
    }

    public void setProductDetailName(String productDetailName) {
        ProductDetailName = productDetailName;
    }

    public String getProductDetailPrice() {
        return ProductDetailPrice;
    }

    public void setProductDetailPrice(String productDetailPrice) {
        ProductDetailPrice = productDetailPrice;
    }

    public String getProductDetailDescript() {
        return ProductDetailDescript;
    }

    public void setProductDetailDescript(String productDetailDescript) {
        ProductDetailDescript = productDetailDescript;
    }

    public String getProductDetailFunction() {
        return ProductDetailFunction;
    }

    public void setProductDetailFunction(String productDetailFunction) {
        ProductDetailFunction = productDetailFunction;
    }

    public String getProductDetailH2U() {
        return ProductDetailH2U;
    }

    public void setProductDetailH2U(String productDetailH2U) {
        ProductDetailH2U = productDetailH2U;
    }
}
