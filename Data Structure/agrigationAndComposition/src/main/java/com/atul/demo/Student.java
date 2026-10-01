package com.atul.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Column(name = "student_id")
    private int studentId;

    @Column(name = "student_name")
    private String studentName;

    @Embedded         
    private Address studAdr;

    public Student() {
    }

    public Student(int studentId, String studentName, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studAdr = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getAddress() {
        return studAdr;
    }

    public void setAddress(Address address) {
        studAdr = address;
    }
}
