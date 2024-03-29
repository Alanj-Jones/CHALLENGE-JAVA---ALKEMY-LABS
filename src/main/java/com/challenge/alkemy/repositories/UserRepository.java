package com.challenge.alkemy.repositories;

import java.util.Optional;

import com.challenge.alkemy.models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer>{

    @Query("SELECT u FROM User u WHERE u.username = :username")
    public User getUserByUsername(@Param("username") String username);

    Optional<User> findByUsername(String username);
}
