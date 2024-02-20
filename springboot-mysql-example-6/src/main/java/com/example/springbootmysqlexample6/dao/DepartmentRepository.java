package com.example.springbootmysqlexample6.dao;

import com.example.springbootmysqlexample6.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
