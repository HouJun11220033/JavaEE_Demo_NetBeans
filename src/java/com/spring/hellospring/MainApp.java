package com.spring.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw = (HelloWorld) ac.getBean("helloworld");
        HelloWorld hw_1 = (HelloWorld) ac.getBean("helloworld_1");
        hw.getMessage();
        hw.destory();

    }

}
