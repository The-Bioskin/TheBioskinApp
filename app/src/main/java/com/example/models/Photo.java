package com.example.models;

import java.io.Serializable;

public class Photo implements Serializable {
    private int rsourceId;

    public Photo(int rsourceId) {
        this.rsourceId = rsourceId;
    }

    public int getRsourceId() {
        return rsourceId;
    }

    public void setRsourceId(int rsourceId) {
        this.rsourceId = rsourceId;
    }
}
