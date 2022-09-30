package com.acs.studentDetails.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="student_table")
public class Student {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="studentid")
    private int id;
   @Column(name="studentname")
    private String name;
   @Column(name = "studentcourses")
    private String courses;
   @Column(name = "studentclass")
    private String className;
   @Column(name = "paid_Fee")
    private double paidFee;

    public Student(int id, String name, String courses, String className, double paidFee) {
        this.id = id;
        this.name = name;
        this.courses = courses;
        this.className = className;
        this.paidFee = paidFee;
    }

    public Student() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCourses() {

        return courses;
    }

    public void setCourses(String courses) {

        this.courses = courses;
    }

    public String getClassName() {


        return className;
    }

    public void setClassName(String className) {

        this.className = className;
    }

    public double getPaidFee() {

        return paidFee;
    }

    public void setPaidFee(double paidFee) {

        this.paidFee = paidFee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses='" + courses + '\'' +
                ", className='" + className + '\'' +
                ", paidFee=" + paidFee +
                '}';
    }
}
