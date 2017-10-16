package com.essilor;

public class People {
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private String dept;
    private int rollNo;
    private Gender gender;


    public People(String name, String dept, int rollNo,Gender gender) {
        super();
        this.name = name;
        this.dept = dept;
        this.rollNo = rollNo;
        this.gender=gender;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public int getRollNo() {
        return rollNo;
    }
    public Gender getGender() {
        return gender;
    }
    public String toString() {
        return String.format("%s----%s----%s----%d",name,gender,dept,rollNo);
    }






}
