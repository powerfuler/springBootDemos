package com.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.model.Department;

@Mapper
public interface DepartmentMapper {

    public void insert(Department department);
    
    public Department getById(Integer id);
    
    public void update(Department department);
    
    public void deleteById(Integer id);
}