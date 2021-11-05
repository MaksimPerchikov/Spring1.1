package ru.ibs.trainee.spring.bfpp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class AnotherComponentImpl implements AnotherComponent {

    @Autowired
    private SomeComponent someComponent;

    /*public void setSomeComponent(SomeComponent someComponent) {
        this.someComponent = someComponent;
    }*/
  /*  public AnotherComponentImpl(SomeComponent someComponent){
        this.someComponent = someComponent;
    }*/
    @PostConstruct
    private void postConstruct(){
        System.out.println(getClass()+" postConstruct");
    }


    public void init(){
        System.out.println(getClass()+" init");

    }
    public void destroy(){
        System.out.println(getClass()+" destroy");
    }
}
