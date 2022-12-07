package com.example.models;

import java.io.Serializable;

public class Category implements Serializable {
    private int Image;
    private String CategoryName;
    private String CategoryQuantity;

    public Category(int image, String categoryName, String categoryQuantity) {
        Image = image;
        CategoryName = categoryName;
        CategoryQuantity = categoryQuantity;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getCategoryQuantity() {
        return CategoryQuantity;
    }

    public void setCategoryQuantity(String categoryQuantity) {
        CategoryQuantity = categoryQuantity;
    }
}
