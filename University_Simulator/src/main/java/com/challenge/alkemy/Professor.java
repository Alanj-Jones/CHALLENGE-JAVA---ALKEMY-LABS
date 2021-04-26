package com.challenge.alkemy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @Column(name = "professor_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer professorId;

    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "document")
    private int document;

    @Column(name = "is_active")
    private boolean isActive;

    public Professor() {}

    public Professor(String firstName, String lastName, int document, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.isActive = isActive;
    }

    public Integer getProfessorId() {
        return this.professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDocument() {
        return this.document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

}