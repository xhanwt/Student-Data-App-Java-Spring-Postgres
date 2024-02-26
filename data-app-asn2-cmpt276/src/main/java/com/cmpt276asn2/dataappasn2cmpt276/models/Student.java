package com.cmpt276asn2.dataappasn2cmpt276.models;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int uid;

    private String name;
    private int weight;
    private int height;
    private String haircolor;
    private double gpa;



    public Student() {
    }

    public Student(String name, int weight, int height, String haircolor, double gpa) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.haircolor = haircolor;
        this.gpa = gpa;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
    
}
