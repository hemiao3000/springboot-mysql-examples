package com.example.springbootmysqlexample7.web;

import com.example.springbootmysqlexample7.entity.Department;
import com.example.springbootmysqlexample7.service.DepartmentService;
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

    @RequestMapping("/delete-by-id")
    public String removeDepartment(@RequestParam("id") Long id) {
        try {
            departmentService.deleteDepartmentById(id);
        } catch (RuntimeException e) {
            return "FAILURE";
        }
        return "SUCCESS";
    }
}
