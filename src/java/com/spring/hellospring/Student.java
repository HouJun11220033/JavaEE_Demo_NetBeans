package com.spring.hellospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {

    private Integer age;
    private String name;

    @Autowired(required = false)
    public Integer getAge() {
        return age;
    }

    //@Required
    public void setAge(Integer age) {
        this.age = age;
    }

    @Autowired
    public String getName() {
        return name;
    }

    // @Required
    public void setName(String name) {
        this.name = name;
    }

}
