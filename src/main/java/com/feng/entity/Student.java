package com.feng.entity;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Student {
    private int id;

    @NotNull(message = " name can't be null")
    @Size(min = 6 , max = 12 , message = "姓名必须大于{min},小于{max}")
    private String name;

    @Min(value = 18, message = "{student.age.range}")
    @Max(value = 25, message = "{student.age.range}")
    private int age;

    private String sex;
}
