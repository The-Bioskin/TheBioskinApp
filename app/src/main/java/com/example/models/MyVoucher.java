package com.example.models;

import java.io.Serializable;

public class MyVoucher implements Serializable {
    private int Thumb;
    private String voucherName;
    private String voucherValue;
    private String useVoucher;

    public MyVoucher(int thumb, String voucherName, String voucherValue, String useVoucher) {
        Thumb = thumb;
        this.voucherName = voucherName;
        this.voucherValue = voucherValue;
        this.useVoucher = useVoucher;
    }

    public int getThumb() {
        return Thumb;
    }

    public void setThumb(int thumb) {
        Thumb = thumb;
    }

    public String getVoucherName() {
        return voucherName;
    }

    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }

    public String getVoucherValue() {
        return voucherValue;
    }

    public void setVoucherValue(String voucherValue) {
        this.voucherValue = voucherValue;
    }

    public String getUseVoucher() {
        return useVoucher;
    }

    public void setUseVoucher(String useVoucher) {
        this.useVoucher = useVoucher;
    }
}
