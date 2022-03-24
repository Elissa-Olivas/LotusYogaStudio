package com.detroitlabs.LotusYogaStudio.Model;

public class Classes {
    private String nameOfClass;           //name of class
    private String classDescription;     //description of class
    private String heatIntensity;            //heat instensity of class
    private String humidity;                //humidity of class
    private String picID;;           //pic of class


    //Constructor
    public Classes(String nameOfClass, String classDescription, String heatIntensity, String humidity, String picID) {
        this.nameOfClass = nameOfClass;
        this.classDescription = classDescription;
        this.heatIntensity = heatIntensity;
        this.humidity = humidity;
        this.picID = picID;
    }

    //Getters and Setters
    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public String getHeatIntensity() {
        return heatIntensity;
    }

    public void setHeatIntensity(String heatIntensity) {
        this.heatIntensity = heatIntensity;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

//    public String getTimeOfClass() {
//        return timeOfClass;
//    }
//
//    public void setTimeOfClass(String timeOfClass) {
//        this.timeOfClass = timeOfClass;
//    }

    public String getPicID() {
        return picID;
    }

    public void setPicID(String picID) {
        this.picID = picID;
    }
}
