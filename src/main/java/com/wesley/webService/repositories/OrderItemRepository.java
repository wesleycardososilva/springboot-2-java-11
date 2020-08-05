package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
