package com.spring.hellospring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        ApplicationContext ac_1 = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        ApplicationContext ac_2 = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //换用AbstractApplicationContext对象时，可以调用销毁方法。。。
        //在非Web应用中，手工加载Spring IoC容器，不能用ApplicationContext，要用AbstractApplicationContext。用完以后要记得调用ctx.close()关闭容器。如果不记得关闭容器，最典型的问题就是数据库连接不能释放
        //  HelloWorld hw = (HelloWorld) context.getBean("helloworld_1");
        //  HelloWorld hw_1 = (HelloWorld) context.getBean("helloworld");
        //  HelloChina hc_1 = (HelloChina) context.getBean("hellochina");
        HelloWorld helloworld = ac_1.getBean(HelloWorld.class);
        TextEditor te = ac_2.getBean(TextEditor.class);

        //  TextEditor te = (TextEditor) ac.getBean("textEditor");
        helloworld.setMessage1("Hello World!");
        helloworld.getMessage1();
        // Profile pro=(Profile) ac.getBean("profile");
        //  JavaCollection jc = (JavaCollection) ac.getBean("javaCollection");
//        Student stu = (Student) ac.getBean("student");

        // hw.setMessage("I am object hw");
        //hw.destory();
        //  hw.getMessage();
        //BeanPostProcessor接口对每一个在XML文件中配置的Bean都有效
        //hw_1.getMessage1();
        // hw_1.getMessage2();
        //System.out.println("----------------------------------------------------------");
//        hc_1.getMessage1();
//        hc_1.getMessage2();
//        hc_1.getMessage3();
        //    te.getSpellChecker();
        //   te.setSpellChecker(spellChecker);
//        jc.getAddrList();
//        jc.getAddrMap();
        //properties对象返回的必须是两个string类型的
//        jc.getAddrProp();
//        jc.getAddrSet();
//        System.out.println("Name : " + stu.getName());
//        System.out.println("Age : " + stu.getAge());
        te.spellCheck();
        // pro.printAge();
        //pro.printName();
        //  context.registerShutdownHook();
        //在非Web应用中关闭Ioc容器，需要调用registerShutdownHook方法
    }

}
