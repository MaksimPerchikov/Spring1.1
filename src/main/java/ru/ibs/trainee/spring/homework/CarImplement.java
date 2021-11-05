package ru.ibs.trainee.spring.homework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarImplement implements Car {

    @Autowired
   private Engine engine;


    CarImplement(Engine engine){
        this.engine = engine;
    }


    @Override
    public void drive() {
        System.out.println("aa");
    }
}
