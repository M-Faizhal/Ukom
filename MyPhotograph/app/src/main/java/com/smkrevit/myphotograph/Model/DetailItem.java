package com.smkrevit.myphotograph.Model;

public class DetailItem {
    private String namaPaket, descPaket, hargaPaket;

    public DetailItem(String namaPaket, String descPaket, String hargaPaket) {
        this.namaPaket = namaPaket;
        this.descPaket = descPaket;
        this.hargaPaket = hargaPaket;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public String getDescPaket() {
        return descPaket;
    }

    public void setDescPaket(String descPaket) {
        this.descPaket = descPaket;
    }

    public String getHargaPaket() {
        return hargaPaket;
    }

    public void setHargaPaket(String hargaPaket) {
        this.hargaPaket = hargaPaket;
    }
}
