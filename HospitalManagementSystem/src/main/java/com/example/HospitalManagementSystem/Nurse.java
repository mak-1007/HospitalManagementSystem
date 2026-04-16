package com.example.HospitalManagementSystem;

public class Nurse {
    private int nurseId;
    private String name;
    private int age;
    private String qualification;

    public Nurse(int nurseId, String name, int age, String qualification){
        this.nurseId=nurseId;
        this.name=name;
        this.age=age;
        this.qualification=qualification;
    }

    public int getnurseId(){
        return nurseId;
    }
    public void setnurseId(int nurseId){
        this.nurseId=nurseId;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }
}
