package com.spring.controller;

import com.model.Address;
import com.model.User;
import java.io.IOException;
import java.io.Writer;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class Controller_1 {

    private static final String SUCCESS = "success";
    @RequestMapping("/testServletAPI")
    public void testServletAPI(HttpServletResponse response,Writer out) throws IOException
    {
        System.out.println("Response:"+response);
        out.write("Hello SpringMVC !");
      //  return SUCCESS;
    
    }

    @RequestMapping("/testPojo")
    public String testPoji(User user) {
        System.out.println("testPojo" + user);
        return SUCCESS;

    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println("testPathVariable" + id);
        return SUCCESS;
    }

    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath() {
        System.out.println("testAntPath");

        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println(sessionId);
        return sessionId;
    }

}
