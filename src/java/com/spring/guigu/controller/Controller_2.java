package com.spring.guigu.controller;

import com.spring.guigu.dao.EmployeeDao;
import com.spring.guigu.model.Employee;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class Controller_2 {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping("/i18n")
    public String testI18n(Locale locale) {
        String val = messageSource.getMessage("i18n.user", null, locale);
        System.out.println(val);
        return "i18n";
    }

    @RequestMapping("/testUpload")
    public String testUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("Desc :" + desc);
        System.out.println("OriginalFileName :" + file.getOriginalFilename());
        System.out.println("InputStream:" + file.getInputStream());
        return "success";

    }

    @RequestMapping("/testResponseEntity")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        byte[] body = null;
        ServletContext servletContext = session.getServletContext();
        InputStream in = servletContext.getResourceAsStream("/files/abc.txt");
        body = new byte[in.available()];
        in.read(body);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=abc.txt");

        HttpStatus statusCode = HttpStatus.OK;

        ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
        return response;
    }

    @ResponseBody
    @RequestMapping("/testHttpMessageConverter")
    public String testHttpMessageConverter(@RequestBody String body) {
        System.out.println(body);
        return "HelloWorld !" + new Date();
    }

    @ResponseBody
    @RequestMapping("/testJson")
    public Collection<Employee> testJson() {
        return employeeDao.getAll();

        //return "index";
    }

    @RequestMapping("/testConversionServiceConverer")
    public String testConverter(@RequestParam Employee employee) {
        System.out.println("Save:" + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

}
