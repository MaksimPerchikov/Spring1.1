package ru.ibs.trainee.spring.test;

public class DieselEngineImplement implements Engine{

    @Override
    public void launch() {
        System.out.println(getClass() + "DieselEngineImplement");
    }
}
