package com.example.recyclerview;

public class Contacts {
    private String name;
    private String phoneNo;
    private int imageId;

    public Contacts(String name,String phoneNo, int imageId){

        this.name= name;
        this.imageId=imageId;
        this.phoneNo=phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
