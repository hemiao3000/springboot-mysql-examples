package com.example.springbootmysqlexample5.web;

import com.example.springbootmysqlexample5.entity.Department;
import com.example.springbootmysqlexample5.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department-by-id")
    public Department getDepartment(@RequestParam("id") Long id) {
        return departmentService.selectById(id);
    }
}
