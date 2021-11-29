package com.smkrevit.myphotograph.Model;

public class History {
    private String history, pukul, deschistory, status;

    public History(String history, String pukul, String deschistory, String status) {
        this.history = history;
        this.pukul = pukul;
        this.deschistory = deschistory;
        this.status = status;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getPukul() {
        return pukul;
    }

    public void setPukul(String pukul) {
        this.pukul = pukul;
    }

    public String getDeschistory() {
        return deschistory;
    }

    public void setDeschistory(String deschistory) {
        this.deschistory = deschistory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
