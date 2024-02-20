package com.example.springbootmysqlexample4.dao;

import com.example.springbootmysqlexample4.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    Department selectById(Long id);

    List<Department> selectAll();

    Long insert(Department dept);

    Long update(Department dept);

    Long deleteById(Long id);
}
