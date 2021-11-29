package com.smkrevit.myphotograph.Model;

public class Aktivitas {
    private String aktivitas;
    private String pukul;
    private String descaktiv;
    private String status;

    public Aktivitas(String aktivitas, String pukul, String descaktiv, String status) {
        this.aktivitas = aktivitas;
        this.pukul = pukul;
        this.descaktiv = descaktiv;
        this.status = status;
    }

    public String getAktivitas() {
        return aktivitas;
    }

    public void setAktivitas(String aktivitas) {
        this.aktivitas = aktivitas;
    }

    public String getPukul() {
        return pukul;
    }

    public void setPukul(String pukul) {
        this.pukul = pukul;
    }

    public String getDescaktiv() {
        return descaktiv;
    }

    public void setDescaktiv(String descaktiv) {
        this.descaktiv = descaktiv;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
