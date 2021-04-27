package com.challenge.alkemy.repositories;

import com.challenge.alkemy.Professor;

import org.springframework.data.repository.CrudRepository;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
    
    public Professor findByProfessorId(Integer professor_id);
    
}
