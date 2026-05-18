package com.example.lesson1.HomeWork;

import java.sql.SQLOutput;

public class Dog extends Animal {

    private String poroda;

    public Dog(String name, int age, int weight, String poroda) {
        super(name, age, weight);
        this.poroda = poroda;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Гав Гав");
    }

    @Override
    public void eat(int food) {
        super.eat(food);
        System.out.println(getName() + "с удовольствием съел " + food + " кг собачьего корма");
    }
}
