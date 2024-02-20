package com.example.springbootmysqlexample4.dao;

import com.example.springbootmysqlexample4.entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void selectById() {
        System.out.println(departmentMapper.selectById(1L));
    }

    @Test
    void selectAll() {
        departmentMapper.selectAll().forEach(System.out::println);
    }

    @Test
    void insert() {
        Department department = new Department();
        department.setId(5L);
        department.setName("test5");
        department.setLocation("test5");
        System.out.println(departmentMapper.insert(department));
        System.out.println(departmentMapper.selectById(5L));
    }

    @Test
    void update() {
        Department dept = new Department();
        dept.setId(5L);
        dept.setName("TEST5");
        dept.setLocation("TEST5");

        System.out.println(departmentMapper.update(dept));
        System.out.println(departmentMapper.selectById(5L));
    }

    @Test
    void deleteById() {
        System.out.println(departmentMapper.deleteById(5L));
        System.out.println(departmentMapper.selectById(5L));
    }

}