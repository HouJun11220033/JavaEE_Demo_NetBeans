package com.spring.hellospring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private Integer age;
    private String name;

    //@Autowired(required = false)
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }

    //@Required
    public void setAge(Integer age) {
        this.age = age;
    }

   // @Autowired
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }

    // @Required
    public void setName(String name) {
        this.name = name;
    }
    public void printThrowException()
    {
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

}
