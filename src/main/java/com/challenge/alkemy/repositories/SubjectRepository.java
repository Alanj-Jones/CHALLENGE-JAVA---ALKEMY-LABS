package com.challenge.alkemy.repositories;

import java.util.Set;

import com.challenge.alkemy.models.Subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject, Integer>{
    
    public Subject findBySubjectId(Integer subject_id);
    public Set<Subject> findAllByOrderByNameAsc();
}
