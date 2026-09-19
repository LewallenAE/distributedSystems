package com.javafullstack.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {

        //1: Launch Spring Context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2: Configure what we want spring to manage such as - @Configuration
        // HelloWorldConfiguration - @Configuration
        // name - @Bean

        // 3. Retrieves Beans that are managed by spring
        // context.getBean("<name of bean here>")
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address1"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

    } // end main

}
