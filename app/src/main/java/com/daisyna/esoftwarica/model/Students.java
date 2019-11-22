package com.daisyna.esoftwarica.model;

import java.util.ArrayList;
import java.util.List;

public class Students {

    private String name;
    private int age;
    private String address;
    private String gender;
    private int imageId;
    private static List<Students> studentsList=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }



    public Students(String name, String address, String gender, int age, int imageId ){
        this.name=name;
        this.age=age;
        this.address=address;
        this.imageId=imageId;
        this.gender=gender;
    }
    public List<Students> getStudentsList(){
        return  studentsList;
    }
}
