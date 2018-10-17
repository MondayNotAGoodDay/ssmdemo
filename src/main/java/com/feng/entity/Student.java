package com.feng.entity;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class Student {
    private int id;

    @NotNull(message = "{student.name.isNull}")
    private String name;

    @Min(value = 18, message = "{student.age.range}")
    @Max(value = 25, message = "{student.age.range}")
    private int age;

    private String sex;
}
