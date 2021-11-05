package ru.ibs.trainee.spring.homeworksecond;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class Diesel implements Engine{

    @Autowired
    private Engine engine;

    @PostConstruct
    public void postConstruct(){
        powerUp();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void powerUp() {
        System.out.println(getClass()+ ": на дизеле");
    }
}
