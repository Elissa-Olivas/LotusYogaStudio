package com.detroitlabs.LotusYogaStudio.Model;

public class Instructors {
    private String nameOfInstructor;          //name of instructor
    private String bio;                       //bio of instructor
    private String instructorPicID;           //id for pic of instructor


    //Constructor
    public Instructors(String nameOfInstructor, String bio, String instructorPicID) {
        this.nameOfInstructor = nameOfInstructor;
        this.bio = bio;
        this.instructorPicID = instructorPicID;
    }

    //Getters and Setters
    public String getNameOfInstructor() {
        return nameOfInstructor;
    }

    public void setNameOfInstructor(String nameOfInstructor) {
        this.nameOfInstructor = nameOfInstructor;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getInstructorPicID() {
        return instructorPicID;
    }

    public void setInstructorPicID(String instructorPicID) {
        this.instructorPicID = instructorPicID;
    }
}
