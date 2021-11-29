package com.smkrevit.myphotograph.Model;

public class Notif {
    private String notif;
    private String desc;

    public Notif(String notif, String desc) {
        this.notif = notif;
        this.desc = desc;
    }

    public String getNotif() {
        return notif;
    }

    public void setNotif(String notif) {
        this.notif = notif;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
