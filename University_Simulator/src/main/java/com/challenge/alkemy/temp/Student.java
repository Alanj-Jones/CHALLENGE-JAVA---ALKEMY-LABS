package com.challenge.alkemy.temp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.challenge.alkemy.models.Subject;
import com.challenge.alkemy.models.User;

// @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
// @Table(name = "student")
// @Entity
public class Student extends User{ 

    // @Id
    // @Column(name = "student_id")
    // private Integer studentId;

    // @NotNull
    // @Column(name = "legajo")
    // private int file;
    // @NotNull
    // @Column(name = "document")
    // private int document;

    // @JoinTable(
    //             name="student_subject", 
    //             joinColumns = @JoinColumn(name="student_id"),
    //             inverseJoinColumns = @JoinColumn( name = "subject_id")
    //         )
    // @ManyToMany(cascade = CascadeType.ALL)
    // private Set<Subject> subjects = new HashSet<>();

    // public Student() {
    //     // this.document = Integer.parseInt(super.getPassword()) ;
    //     // this.file = Integer.parseInt(super.getUsername()); 
    // }


    // public Integer getStudentId() {
    //     return this.studentId;
    // }

    // public void setStudentId(Integer studentId) {
    //     this.studentId = studentId;
    // }

    // public int getDocument() {
    //     return this.document;
    // }

    // public void setDocument(int document) {
    //     this.document = document;
    // }

    // public int getFile() {
    //     return this.file;
    // }

    // public void setFile(int file) {
    //     this.file = file;
    // }

    // public Set<Subject> getSubjects() {
    //     return this.subjects;
    // }

    // public void setSubjects(Set<Subject> subjects) {
    //     this.subjects = subjects;
    // }


}
