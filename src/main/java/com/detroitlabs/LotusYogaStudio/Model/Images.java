package com.detroitlabs.LotusYogaStudio.Model;

public class Images {
    private String name;
    private String picID;


    public Images(String name, String picID) {
        this.name = name;
        this.picID = picID;
    }

    public String getPicID() {
        return picID;
    }

    public void setPicID(String picID) {
        this.picID = picID;
    }

    public Images(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
