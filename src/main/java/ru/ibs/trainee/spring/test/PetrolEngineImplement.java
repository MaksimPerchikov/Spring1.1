package ru.ibs.trainee.spring.test;

public class PetrolEngineImplement implements Engine{

    @Override
    public void launch() {
        System.out.println(getClass() + "PetrolEngineImplement");
    }
}
