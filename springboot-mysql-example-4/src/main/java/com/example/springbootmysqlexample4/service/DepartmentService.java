package com.example.springbootmysqlexample4.service;

import com.example.springbootmysqlexample4.dao.DepartmentMapper;
import com.example.springbootmysqlexample4.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public Department selectById(Long id) {
        return departmentMapper.selectById(id);
    }

    public List<Department> selectAll() {
        return departmentMapper.selectAll();
    }

    public Long insert(Department dept) {
        return departmentMapper.insert(dept);
    }

    Long update(Department dept) {
        return departmentMapper.update(dept);
    }

    public Long deleteById(Long id) {
        return departmentMapper.deleteById(id);
    }
}
