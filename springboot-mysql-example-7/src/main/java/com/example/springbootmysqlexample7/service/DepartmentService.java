package com.example.springbootmysqlexample7.service;

import com.example.springbootmysqlexample7.dao.DepartmentRepository;
import com.example.springbootmysqlexample7.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Transactional
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
        throw new RuntimeException("故意抛出异常");
    }

}
