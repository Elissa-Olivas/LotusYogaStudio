package com.detroitlabs.LotusYogaStudio.Model;

public class Company {
    private String nameOfCompany;               //name of company
    private String phnNum;                      //phnNum of company
    private String address;                     //address of company
    private String email;                       //email of company



    //Constructor
    public Company(String nameOfCompany, String phnNum, String address, String email) {
        this.nameOfCompany = nameOfCompany;
        this.phnNum = phnNum;
        this.address = address;
        this.email = email;
    }

    //Getters and Setters
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
