package com.example.lesson1.HomeWork;

import java.sql.SQLOutput;

public class Cat extends Animal {

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Мяу Мяу");
    }

    public void eat(int food) {
        super.eat(food);
        System.out.println(getName() + "с удовольствием съел " + food + " кг рыбы");
    }

}
