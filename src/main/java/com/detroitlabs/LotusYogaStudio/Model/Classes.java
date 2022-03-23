package com.detroitlabs.LotusYogaStudio.Model;

public class Classes {
    private String nameOfClass;           //name of class
    private String classDescription;     //description of class
    private String heatIntensity;            //heat instensity of class
    private String humidity;                //humidity of class
    private String timeOfClass;          //time of class
    private String classPicID;           //pic of class


    //Constructor
    public Classes(String nameOfClass, String classDescription, String heatIntensity, String humidity, String timeOfClass, String classPicID) {
        this.nameOfClass = nameOfClass;
        this.classDescription = classDescription;
        this.heatIntensity = heatIntensity;
        this.humidity = humidity;
        this.timeOfClass = timeOfClass;
        this.classPicID = classPicID;
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

    public String getTimeOfClass() {
        return timeOfClass;
    }

    public void setTimeOfClass(String timeOfClass) {
        this.timeOfClass = timeOfClass;
    }

    public String getClassPicID() {
        return classPicID;
    }

    public void setClassPicID(String classPicID) {
        this.classPicID = classPicID;
    }
}
