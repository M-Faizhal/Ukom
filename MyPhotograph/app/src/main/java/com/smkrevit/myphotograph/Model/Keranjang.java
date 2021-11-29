package com.smkrevit.myphotograph.Model;

public class Keranjang {
    private String nama, descPesanan, hargaPesanan;

    public Keranjang(String nama, String descPesanan, String hargaPesanan) {
        this.nama = nama;
        this.descPesanan = descPesanan;
        this.hargaPesanan = hargaPesanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDescPesanan() {
        return descPesanan;
    }

    public void setDescPesanan(String descPesanan) {
        this.descPesanan = descPesanan;
    }

    public String getHargaPesanan() {
        return hargaPesanan;
    }

    public void setHargaPesanan(String hargaPesanan) {
        this.hargaPesanan = hargaPesanan;
    }
}
