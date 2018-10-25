package com.feng.controller;

import com.feng.entity.Student;
import com.feng.service.StudentService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Log
@Controller
@RequestMapping("/student")
public class StuController {

    @Autowired
    private StudentService studentService;
    @InitBinder
    public void initBinder(WebDataBinder binder){
        //添加Student类的Validator
        //binder.addValidators(new StudentValidator());

        //添加字段转换器,将传入的对应类型的参数进行处理
        //binder.registerCustomEditor(Integer.class,new CustomDateEditor(new SimpleDateFormat("dd/mm/yyyy"),true));
        //binder.registerCustomEditor(String.class,new PropertyEditorSupport(){
        //    @Override
        //    public void setAsText(String text) throws IllegalArgumentException {
        //            setValue(text);
        //    }
        //    @Override
        //    public String getAsText() {
        //        Object value = getValue();
        //        return value != null ? value.toString() : "";
        //    }
        //});
    }


    //@InitBinder("user")
    //public void initBinder1(WebDataBinder binder) {
    //    binder.setFieldDefaultPrefix("user.");
    //}
    //
    //@InitBinder("student")s
    //public void initBinder2(WebDataBinder binder) {
    //    binder.setFieldDefaultPrefix("student.");
    //}


    @RequestMapping("/addStudent")
    public String addStudent(@ModelAttribute("student") @Validated Student student, BindingResult errors, Model model, HttpServletResponse response){
        String name = student.getName();
        int id = student.getId();
        if (name == null || name.equals("")) {
            return "redirect:getAllStudent";
        }
        if(errors.hasErrors()){
            return "error";
        }
        System.out.println(student + "\r\n");
        studentService.addStudent(student);
        return "success";
    }

    @RequestMapping("/getStudent")
    public String getStudentById(int id,Model model) {
        Student student = studentService.selectStuById(id);
        model.addAttribute("student", student);
        return "success";
    }

    @RequestMapping("/getAllStudent")
    public String getAllStudent(Model model) {
        List<Student> list = studentService.getStudentList();
        for (Student student : list) {
            System.out.println(student);
        }
        model.addAttribute("list",list);
        return "success";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(int id, Model model) {
        studentService.deleteStudent(id);
        return "success";
    }

    @RequestMapping("/udpateStudent")
    public String updateStudent(int id,String name) {
        studentService.updateStudent(id,name);
        return "success";
    }

    @RequestMapping(value = "/upload")
    public String upload(@RequestPart("picture") MultipartFile picture, Model model) {
        System.out.println(picture.getOriginalFilename());
        System.out.println(picture.getName());
        System.out.println(picture.getSize());
        System.out.println("fuck");
        System.out.println("fuck twice");
        System.out.println("fuck three");
        return "success";
    }
}
