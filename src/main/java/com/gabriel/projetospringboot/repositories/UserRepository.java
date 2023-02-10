package com.gabriel.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.projetospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    
}
