package com.mongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, Integer> {


}