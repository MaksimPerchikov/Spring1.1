package ru.ibs.trainee.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-application-context.xml");

        Car car1 = new CarImplement(new PetrolEngineImplement());
        car1.drive();
    }
}
