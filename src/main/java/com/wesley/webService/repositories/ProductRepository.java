package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
