package com.spring.guigu.controller;


import com.spring.guigu.dao.DepartmentDao;
import com.spring.guigu.dao.EmployeeDao;
import com.spring.guigu.model.Employee;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping(value = "/emp", method = RequestMethod.POST)

    public String save(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";

    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String input(Map<String, Object> map) {
        map.put("departments", departmentDao.getDepartments());
        map.put("employee", new Employee());
        return "input";

    }

    @RequestMapping("/emps")
    public String list(Map<String, Object> map) {
        map.put("employees", employeeDao.getAll());
        return "list";
    }

}
