package com.neo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}