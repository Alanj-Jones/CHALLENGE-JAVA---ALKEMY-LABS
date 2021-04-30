package com.challenge.alkemy.models;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subjectId;

    @NotNull
    @Size(min = 2, max = 30)
    @Column(name = "name")    
    private String name;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "capacity")
    private int capacity;

    @NotNull
    @Column(name = "start_time")
    private LocalTime start_time;

    @NotNull
    @Column(name = "end_time")
    private LocalTime end_time;

    @NotNull
    @Column(name = "professor_id")
    private Integer professor_id;
    
    @ManyToMany(mappedBy = "subjects")
    private Set<User> students = new HashSet<>();

    public Subject() {
    }
    public Subject(String name, String description, int capacity, LocalTime start_time, LocalTime end_time) {
        this.name = name;
        this.description = description;
        this.capacity = capacity;
        this.start_time = start_time;
        this.end_time = end_time;
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

    public Integer getSubjectId() {
        return this.subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getProfessor_id() {
        return this.professor_id;
    }

    public void setProfessor_id(Integer professor_id) {
        this.professor_id = professor_id;
    }
}