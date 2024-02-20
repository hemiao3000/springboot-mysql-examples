package com.example.springbootmysqlexample6.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository repository;

    @Test
    public void select() {
        System.out.println(repository.findById(1L).get());
    }

}