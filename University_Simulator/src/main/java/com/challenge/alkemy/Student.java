package com.challenge.alkemy;

public class Student extends User {
    
    private String studentName;
    private String studentMail;
    private int dni;

    public Student() {}

    public Student(int dni, String name, String email) {
        super(Role.STUDENT);
        this.dni = dni ;
        this.studentMail = email;
        this.studentName = name;

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
