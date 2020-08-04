package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
