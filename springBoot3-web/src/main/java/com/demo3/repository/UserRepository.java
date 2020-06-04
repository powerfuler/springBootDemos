package com.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo3.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String username, String email);
    
}