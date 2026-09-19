package com.javafullstack.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

        @Bean
        public String name() {
            return "Lewallen";
        }

        @Bean
        public int age() {
            return 40;
        }

        @Bean
        public Person person() {
           return new Person("Ravi", 20, new Address("Sesame Street", "Sesame Town"));
        }

        @Bean(name = "address1")
        public Address address() {
            return new Address("12345", "San Francisco");
        }

        @Bean
        public Person person2MethodCall() {
            return new Person(name(), age(), address());
        }

        @Bean
        public Person person3Parameters(String name, int age, Address address1) {
            return new Person(name, age, address1);
        }

}
