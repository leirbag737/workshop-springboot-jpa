package com.gabriel.projetospringboot.repositories;

import com.gabriel.projetospringboot.entities.OrderItem;
import com.gabriel.projetospringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
    
}
