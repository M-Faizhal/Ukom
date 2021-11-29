package com.smkrevit.myphotograph.Model;

public class Item {
    private String item;
    private String nama;
    private String alamat;
    private String pukul;
    private String rating;

    public Item(String item, String nama, String alamat, String pukul, String rating) {
        this.item = item;
        this.nama = nama;
        this.alamat = alamat;
        this.pukul = pukul;
        this.rating = rating;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPukul() {
        return pukul;
    }

    public void setPukul(String pukul) {
        this.pukul = pukul;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
