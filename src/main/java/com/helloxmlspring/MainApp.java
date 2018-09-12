package com.helloxmlspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String []args){
        //应用上下文（容器）
       AbstractApplicationContext context=new ClassPathXmlApplicationContext("META-INF/spring/spring-config.xml");
        //AbstractApplicationContext 和ApplicationContext的区别？
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
        helloWorld.sayHello();
        context.registerShutdownHook();

    }
}
