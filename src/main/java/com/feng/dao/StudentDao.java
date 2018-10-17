package com.feng.dao;

import com.feng.entity.Student;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface StudentDao {
    Student selectStuById(int id);
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    List<Student> getStudentList();
}
