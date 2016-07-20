package com.spring.hellospring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //换用AbstractApplicationContext对象时，可以调用销毁方法。。。
        //在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。如果不记得关闭容器，最典型的问题就是数据库连接不能释放
        HelloWorld hw = (HelloWorld) context.getBean("helloworld_1");
        HelloWorld hw_1 = (HelloWorld) context.getBean("helloworld_1");
        hw.setMessage("I am object hw");
        //hw.destory();
        hw.getMessage();
        hw_1.getMessage();
        context.registerShutdownHook();
        //在非Web应用中关闭Ioc容器，需要调用registerShutdownHook方法

    }

}
