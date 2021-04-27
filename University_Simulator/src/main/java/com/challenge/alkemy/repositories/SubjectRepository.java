package com.challenge.alkemy.repositories;

import com.challenge.alkemy.Subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer>{
    
    public Subject findBySubjectId(Integer subject_id);
}
