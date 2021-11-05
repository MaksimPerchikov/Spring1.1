package ru.ibs.trainee.spring.test;

public class CarImplement implements Car{

   private Engine engine;

    /*@Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }*/

    CarImplement(Engine engine){
        this.engine = engine;
    }
    CarImplement(){}
    @Override
    public void drive() {
        System.out.println();
    }
}
