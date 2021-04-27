package com.challenge.alkemy.temp;

import com.challenge.alkemy.models.User;

public class Student extends User {
    
    private String studentName;
    private String studentMail;
    private int document;
    private int studentId; //Legajo

    public Student() {}

    public Student(int document, String name, String email, int id) {
        // super(Role.STUDENT);
        this.document = document ;
        this.studentMail = email;
        this.studentName = name;
        this.studentId = id; 

    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentMail() {
        return this.studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public int getDocument() {
        return this.document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

}
