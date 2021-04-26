package com.challenge.alkemy;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subjectId;

    @Column(name = "name")    
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "start_time")
    private LocalTime start_time;

    @Column(name = "end_time")
    private LocalTime end_time;

    // @ForeignKey(name = "professor_id")
    @Column(name = "professor_id")
    private Integer professor_id;

    // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // @JoinTable(
    //         name="professor_subject", 
    //         joinColumns = @JoinColumn(name="professor_id"),
    //         inverseJoinColumns = @JoinColumn( name = "subject_id")
    //     )
    // private Set<Subject> subjects = new HashSet<>();

    public Subject() {
    }

    public Subject(String name, String description, int capacity, LocalTime start_time, LocalTime end_time, Integer professor_id) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.start_time = start_time;
        this.end_time = end_time;
        this.professor_id = professor_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalTime getStart_time() {
        return this.start_time;
    }

    public void setStart_time(LocalTime start_time) {
        this.start_time = start_time;
    }

    public LocalTime getEnd_time() {
        return this.end_time;
    }

    public void setEnd_time(LocalTime end_time) {
        this.end_time = end_time;
    }

    public Integer getProfessor_id() {
        return this.professor_id;
    }

    public void setProfessor_id(Integer professor_id) {
        this.professor_id = professor_id;
    }

    public Integer getSubjectId() {
        return this.subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    // public Set<Subject> getSubjects() {
    //     return this.subjects;
    // }

    // public void setSubjects(Set<Subject> subjects) {
    //     this.subjects = subjects;
    // }

}
