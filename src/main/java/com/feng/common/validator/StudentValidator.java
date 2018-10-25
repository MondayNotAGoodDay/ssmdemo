package com.feng.common.validator;

import com.feng.entity.Student;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Student student = (Student) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","","name is empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"age","","age is empty");
        if(student.getAge()<18){
            errors.rejectValue("age","","age's less than 18");
        }
    }
}