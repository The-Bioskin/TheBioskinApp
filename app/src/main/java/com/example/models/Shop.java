package com.example.models;

import java.io.Serializable;

public class Shop implements Serializable {
    private int ImgShop;
    private String ShopName;
    private String ShopLocation;
    private String ShopTime;
    private String ShopPhone;

    public Shop(int imgShop, String shopName, String shopLocation, String shopTime, String shopPhone) {
        ImgShop = imgShop;
        ShopName = shopName;
        ShopLocation = shopLocation;
        ShopTime = shopTime;
        ShopPhone = shopPhone;
    }

    public int getImgShop() {
        return ImgShop;
    }

    public void setImgShop(int imgShop) {
        ImgShop = imgShop;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public String getShopLocation() {
        return ShopLocation;
    }

    public void setShopLocation(String shopLocation) {
        ShopLocation = shopLocation;
    }

    public String getShopTime() {
        return ShopTime;
    }

    public void setShopTime(String shopTime) {
        ShopTime = shopTime;
    }

    public String getShopPhone() {
        return ShopPhone;
    }

    public void setShopPhone(String shopPhone) {
        ShopPhone = shopPhone;
    }
}
