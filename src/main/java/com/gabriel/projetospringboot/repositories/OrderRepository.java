package com.gabriel.projetospringboot.repositories;

import com.gabriel.projetospringboot.entities.Order;
import com.gabriel.projetospringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
    
}
