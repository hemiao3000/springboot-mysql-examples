package com.example.springbootmysqlexample6.web;

import com.example.springbootmysqlexample6.entity.Department;
import com.example.springbootmysqlexample6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/find-by-id")
    public Department getDepartment(@RequestParam("id") Long id) {
        return departmentService.getDepartment(id);
    }

}
