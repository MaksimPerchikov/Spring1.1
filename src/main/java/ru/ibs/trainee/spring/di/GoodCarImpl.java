package ru.ibs.trainee.spring.di;

public class GoodCarImpl implements Car{
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }



    public GoodCarImpl(Engine engine) {
        this.engine = engine;
    }

    public GoodCarImpl(){}

    @Override
    public void drive() {

    }

    @Override
    public void setEngine() {

    }
}
