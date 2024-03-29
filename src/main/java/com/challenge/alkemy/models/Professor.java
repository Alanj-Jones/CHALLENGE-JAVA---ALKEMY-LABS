package com.challenge.alkemy.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "professor")
public class Professor {
    @Id
    @Column(name = "professor_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer professorId;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "first_name")
    private String firstName;
    
    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "last_name")
    private String lastName;

    @NotNull
	@Min(10000000)
    @Max(99999999)
    @Column(name = "document")
    private int document;

    @NotNull
    @Column(name = "is_active")
    private boolean isActive;

    public Professor() {}

    public Professor(String firstName, String lastName, int document, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.isActive = isActive;
    }
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
        name = "professor_subject",
        joinColumns = @JoinColumn(name="professor_id"),
        inverseJoinColumns = @JoinColumn(name="subject_id")
        )
    private Set<Subject> subjects = new HashSet<>();  

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

    public Set<Subject> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }

}