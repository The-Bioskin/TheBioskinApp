package com.example.models;

import java.io.Serializable;

public class HotProduct implements Serializable {
    private int Image;
    private String HotProductPrice;
    private String HotProductName;
    private String HotProductRating;
    private String HotProductRateNum;

    public HotProduct(int image, String hotProductPrice, String hotProductName, String hotProductRating, String hotProductRateNum) {
        Image = image;
        HotProductPrice = hotProductPrice;
        HotProductName = hotProductName;
        HotProductRating = hotProductRating;
        HotProductRateNum = hotProductRateNum;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getHotProductPrice() {
        return HotProductPrice;
    }

    public void setHotProductPrice(String hotProductPrice) {
        HotProductPrice = hotProductPrice;
    }

    public String getHotProductName() {
        return HotProductName;
    }

    public void setHotProductName(String hotProductName) {
        HotProductName = hotProductName;
    }

    public String getHotProductRating() {
        return HotProductRating;
    }

    public void setHotProductRating(String hotProductRating) {
        HotProductRating = hotProductRating;
    }

    public String getHotProductRateNum() {
        return HotProductRateNum;
    }

    public void setHotProductRateNum(String hotProductRateNum) {
        HotProductRateNum = hotProductRateNum;
    }
}
