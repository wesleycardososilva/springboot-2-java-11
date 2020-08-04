package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
