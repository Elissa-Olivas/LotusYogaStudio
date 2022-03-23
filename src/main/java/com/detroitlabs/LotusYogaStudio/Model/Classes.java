package com.detroitlabs.LotusYogaStudio.Model;

public class Classes {
    private String nameOfClass;           //name of class
    private String classDescription;     //description of class
    private int heat;                    //heat degree of class
    private int humidity;                //humidity of class
    private String timeOfClass;          //time of class
    private String classPicID;           //pic of class


    //Constructor
    public Classes(String nameOfClass, String classDescription, int heat, int humidity, String timeOfClass, String classPicID) {
        this.nameOfClass = nameOfClass;
        this.classDescription = classDescription;
        this.heat = heat;
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

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
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
