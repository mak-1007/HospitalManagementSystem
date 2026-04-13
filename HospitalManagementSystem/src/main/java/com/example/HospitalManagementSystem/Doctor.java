package com.example.HospitalManagementSystem;
 //object Class 
public class Doctor {
    private String name;
    private String specialization;
    private  int age;
    private String degree;


    public Doctor(String name, String specialization, int age, String degree){
        this.name=name;
        this.specialization=specialization;
        this.age=age;
        this.degree=degree;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
              this.name=name;
    }

    public String getSpecialization(){
        return specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDegree(){
        return degree;
    }
    public void setDegree(String degree){
        this.degree=degree;
    }
}
