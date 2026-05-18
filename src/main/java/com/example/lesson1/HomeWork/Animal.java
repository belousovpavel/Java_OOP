package com.example.lesson1.HomeWork;

import java.math.BigDecimal;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private int satiety;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.satiety = 20;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getSatiety() {
        return satiety;
    }

    public boolean isHungry(){
        return satiety < 30;
    }

    public void makeSound(){
        System.out.println(name+" is making sound");
    }

    public void eat(int food){
        System.out.println(name+" кушает " + food);
        satiety = satiety + food;
        System.out.println("Сытость: "+getName()+" "+satiety);
        if (isHungry()){
            System.out.println("Животное голодное");
        }
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
