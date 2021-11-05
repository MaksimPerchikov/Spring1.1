package ru.ibs.trainee.spring.applicationcontext.xml;

public class SomeComponentImpl implements SomeComponent{



    public void init(){
        System.out.println(getClass() + " init");
    }

    public void destroy(){
        System.out.println(getClass() + " destroy");
    }
}
