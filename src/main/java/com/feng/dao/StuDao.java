//package com.feng.dao;
//
//import com.feng.entity.Student;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.springframework.stereotype.Repository;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//@Repository
//public class StuDao {
//    static String resource = "mybatis-config.xml";
//    static SqlSessionFactory sqlSessionFactory;
//
//    static{
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    }
//
//    /**
//     * @param id Student姓名
//     * @return 一个Student对象
//     */
//    public Student getStudent(int id)  {
//        SqlSession session = sqlSessionFactory.openSession();
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        Student student = mapper.selectStuById(id);
//        session.commit();
//        session.close();
//        return student;
//    }
//
//    public void addStudent(Student student){
//        SqlSession session = sqlSessionFactory.openSession();
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        mapper.addStudent(student);
//        session.commit();
//        session.close();
//    }
//
//    public void deleteStudent(int id){
//        SqlSession session = sqlSessionFactory.openSession();
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        mapper.deleteStudent(id);
//        session.commit();
//        session.close();
//    }
//
//    public void updateStudent(Student student){
//        SqlSession session = sqlSessionFactory.openSession();
//        StudentMapper mapper = session.getMapper(StudentMapper.class);
//        mapper.updateStudent(student);
//        session.commit();
//        session.close();
//    }
//
//}
