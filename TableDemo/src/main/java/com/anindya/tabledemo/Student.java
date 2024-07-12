package com.anindya.tabledemo;

public class Student {
    String Name,Dept,Year;
    Float CGPA;
    int ID;

    public Student(String name, String dept, String year, Float CGPA, int ID) {//function under classes are called methods
        Name = name;
        Dept = dept;
        Year = year;
        this.CGPA = CGPA; //why here this?
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public Float getCGPA() {
        return CGPA;
    }

    public void setCGPA(Float CGPA) {
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
