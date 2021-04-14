package com.challenge.alkemy;

public class Student extends User {
    
    private String studentName;
    private String studentMail;
    private int dni;
    private int studentId; //Legajo

    public Student() {}

    public Student(int dni, String name, String email, int id) {
        super(Role.STUDENT);
        this.dni = dni ;
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

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
