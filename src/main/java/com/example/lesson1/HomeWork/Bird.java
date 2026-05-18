package com.example.lesson1.HomeWork;

public class Bird extends Animal {
    public Bird(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Чирик-чирик");
    }

    @Override
    public void eat(int food) {
        super.eat(food);
        System.out.println(getName() + "с удовольствием съел " + food + " кг семечек");
    }
}
