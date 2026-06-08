package com.example.lesson4;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {

    /**
     * Есть класс Фрукта. У фрукта есть вес.
     * Есть 3 наследника: апельсин, яблоко и золотое яблоко
     *
     * Нужно создать класс "Коробка с фруктами", в которую можно класть фрукты какого-то типа.
     * После создания коробка пустая. В нее можно добавлять фрукты с помощью метода add.
     * У коробки можно узнать сумарный вес с помощью метода #getWeight.
     * Содержимое коробки можно пересыпать в другую коробку. При этом исходная коробка очищается, а вторая наполняется.
     *
     */

    public static void main(String[] args) {

//        Box<String> stringBox = new Box<>();

//        Box<Orange> orangeBox = new Box<>();
//        orangeBox.add(new Orange(1));
//        orangeBox.add(new Orange(2));
//        orangeBox.add(new Apple(1));       // не должно работать
//        orangeBox.add(new GoldenApple(1));// не должно работать
//        System.out.println(orangeBox.getWeight());
//
//        Box<Apple> appleBox = new Box<>();
//        appleBox.add(new Apple(1));
//        appleBox.add(new GoldenApple(2)); // допустимый вариант
//        System.out.println(appleBox.getWeight());
//
//        Box<GoldenApple> goldenAppleBox = new Box<>();
//        goldenAppleBox.add(new GoldenApple(1));
//        goldenAppleBox.add(new Apple(1)); // недопустимый
//        System.out.println(goldenAppleBox.getWeight());
//
//
//        goldenAppleBox.moveTo(appleBox); // рабочий
//        appleBox.moveTo(goldenAppleBox); // нет
//        orangeBox.moveTo(appleBox); // нет
//
//        Box<Orange> orangeBox2 = new Box<>();
//        orangeBox.moveTo(orangeBox);
//        System.out.println(orangeBox.getWeight()); //0
//        System.out.println(orangeBox2.getWeight()); //3

    }

    // FIXME: добавить нужный дженерик
    static class Box<T extends Fruit> {
        // FIXME: реализовать задание
        private List<T> fruits = new ArrayList<>();

        public void add(T fruit){
            fruits.add(fruit);
        }

        public int getWeight(){
            int sumWeight = 0;
            for(T fruit:fruits){
                sumWeight += fruit.getWeight();
            }
            return sumWeight;
        }

        public void moveTo(Box<? super T> anotherBox){
            if (anotherBox == null || anotherBox == this) {
                return;
            }
            for (T fruit : fruits) {
                anotherBox.add(fruit);
            }

            anotherBox.fruits.clear();
        }


    }

    static class Fruit{
        private final int weight;

        public Fruit(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    static class Orange extends Fruit {

        public Orange(int weight) {
            super(weight);
        }
    }

    static class Apple extends Fruit {
        public Apple(int weight) {
            super(weight);
        }
    }

    static class GoldenApple extends Apple {
        public GoldenApple(int weight) {
            super(weight);
        }
    }

}
