package com.example.lesson2.intro;

public abstract class MyAbstractClass1 {

    private String myString;

    public MyAbstractClass1(String myString) {
        this.myString = myString;
    }

    protected MyAbstractClass1(){
        this("default");
    }

    protected abstract void bar();

}
