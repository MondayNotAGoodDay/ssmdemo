package com.feng.service;

import com.feng.dao.StudentDao;
import com.feng.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public Student selectStuById(int id){
        return studentDao.selectStuById(id);
    }

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public void updateStudent(int id,String name) {
        Student student = selectStuById(id);
        student.setName(name);
        studentDao.updateStudent(student);
    }

    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }
}
