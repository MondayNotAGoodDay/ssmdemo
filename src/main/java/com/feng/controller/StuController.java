package com.feng.controller;

import com.feng.entity.Student;
import com.feng.entity.User;
import com.feng.service.StudentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Log
@Controller
@RequestMapping("/student")
public class StuController {

    @Autowired
    private StudentService studentService;

    //@InitBinder
    //public void initBinder(WebDataBinder binder){
    //    //添加Student类的Validator
    //    //binder.addValidators(new StudentValidator());
    //
    //    //添加字段转换器,将传入的对应类型的参数进行处理
    //    binder.registerCustomEditor(Integer.class,new CustomDateEditor(new SimpleDateFormat("dd/mm/yyyy"),true));
    //    binder.registerCustomEditor(String.class,new PropertyEditorSupport(){
    //        @Override
    //        public void setAsText(String text) throws IllegalArgumentException {
    //                setValue(text);
    //        }
    //        @Override
    //        public String getAsText() {
    //            Object value = getValue();
    //            return value != null ? value.toString() : "";
    //        }
    //    });
    //}

    //@InitBinder("user")
    //public void initBinder1(WebDataBinder binder) {
    //    binder.setFieldDefaultPrefix("user.");
    //}
    //
    //@InitBinder("student")
    //public void initBinder2(WebDataBinder binder) {
    //    binder.setFieldDefaultPrefix("student.");
    //}

    @RequestMapping("/addStudent")
    public ModelAndView addStudent(@ModelAttribute("student") Student student){
        System.out.println(student + "\r\n");
        ModelAndView model = new ModelAndView("success");
        model.addObject("student", student);
        studentService.addStudent(student);
        return model;
    }

    @RequestMapping("/getStudent")
    public ModelAndView getStudentById(int id){
        Student student = studentService.selectStuById(id);
        System.out.println(student);
        ModelAndView model = new ModelAndView("success");
        model.addObject("student", student);
        return model;
    }

    @RequestMapping("/getAllStudent")
    public String getAllStudent(ModelAndView model) {
        List<Student> list = studentService.getStudentList();
        for (Student student : list) {
            System.out.println(student);
        }
        model.addObject("list", list);
        return "success";
    }

    @RequestMapping("/deleteStudent")
    public ModelAndView deleteStudent(int id) {
        studentService.deleteStudent(id);
        ModelAndView model = new ModelAndView("success");
        return model;
    }

    @RequestMapping("/udpateStudent")
    public String updateStudent(int id,String name) {
        System.out.println("显示全部学生");
        studentService.updateStudent(id,name);
        return "success";
    }
}
