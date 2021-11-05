package ru.ibs.trainee.spring.applicationcontext.xml;

public class AnotherComponentImpl implements AnotherComponent{

    private SomeComponent someComponent;

    public void setSomeComponent(SomeComponent someComponent) {
        this.someComponent = someComponent;
    }

    public void init(){
        System.out.println(getClass()+" init");

    }
    public void destroy(){
        System.out.println(getClass()+" destroy");
    }
}
