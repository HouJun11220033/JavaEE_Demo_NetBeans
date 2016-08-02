package com.spring.guigu.controller;

import com.spring.guigu.dao.EmployeeDao;
import com.spring.guigu.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller_2 {
    
    @Autowired
    private EmployeeDao employeeDao;
//    @Autowired
//    private ResourceBundleMessageSource messageSource;
    
    @RequestMapping("/testConversionServiceConverer")
    public String testConverter(@RequestParam Employee employee) {
        System.out.println("Save:" + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }
    
}
