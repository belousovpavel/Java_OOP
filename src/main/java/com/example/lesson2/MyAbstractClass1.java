package com.example.lesson2;

public abstract class MyAbstractClass1 {
    //

    private String myName;

    public MyAbstractClass1(String myName) {
        this.myName = myName;
    }

    protected MyAbstractClass1() {
        this("default name");
    }

    protected abstract void foo();

}
