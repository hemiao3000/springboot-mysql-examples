package com.example.springbootmysqlexample3.dao;

import com.example.springbootmysqlexample3.entity.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department selectById(Long id);

    @Select("select * from department")
    List<Department> selectAll();

    @Insert("insert into department values(#{id}, #{name}, #{location})")
    Long insert(Department dept);

    @Update("update department set name = #{name}, location=#{location} where id = #{id}")
    Long update(Department dept);

    @Delete("delete from department where id = #{id}")
    Long deleteById(Long id);
}
