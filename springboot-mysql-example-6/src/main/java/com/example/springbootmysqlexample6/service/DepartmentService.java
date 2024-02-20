package com.example.springbootmysqlexample6.service;

import com.example.springbootmysqlexample6.dao.DepartmentRepository;
import com.example.springbootmysqlexample6.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).get();
    }

}
