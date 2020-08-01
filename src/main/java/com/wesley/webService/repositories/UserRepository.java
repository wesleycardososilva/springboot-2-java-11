package com.wesley.webService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.webService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
