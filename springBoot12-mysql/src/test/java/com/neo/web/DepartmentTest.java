package com.neo.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.neo.mapper.DepartmentMapper;
import com.neo.model.Department;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentTest {

    @Autowired
    private DepartmentMapper departmentMapper;
    
    @Test
    public void testInsert() {
        Department department = new Department();
        department.setId(5);
        department.setName("研发部");
        department.setDescr("开发产品");
        this.departmentMapper.insert(department);
    }
    
    @Test
    public void testGetById() {
        Department department = this.departmentMapper.getById(5);
        System.out.println(department);
    }
    
    @Test
    public void testUpdate() {
        Department department = new Department();
        department.setId(1);
        department.setDescr("开发高级产品");
        this.departmentMapper.update(department);
    }
    
    @Test
    public void testDeleteById() {
        this.departmentMapper.deleteById(1);
    }
}