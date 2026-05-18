package com.example.lesson1.HomeWork;

import java.util.Scanner;

public class HomeWork {
    /**
     * Нужно создать несколько классов животных:
     * 1. Пес
     * 2. Кошка
     * 3. придумать еще парочку
     *
     * Каждое животное имеет:
     * 1. Имя
     * 2. возраст
     * 3. придумать еще какие-то параметры
     *
     * Каждое животное может:
     * 1. Подать голос
     * 2. Питаться (съедает какое-то количество еды)
     * 3. Двигаться
     * 4.  все, что сумеете придумать
     *
     * Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренними.
     * Создать массив с животными и в цикле заставить их поесть и заставить подать голос.
     */
    public static void main(String[] args) {

        Animal dog = new Dog("Бобик", 10, 20, "Toi");
        dog.makeSound();
        dog.eat(2);

        Animal cat = new Cat("Мурзик",10, 20);
        cat.makeSound();
        cat.eat(3);

        Animal bird = new Bird("Попугай", 10,20);
        bird.makeSound();
        bird.eat(15);



//       Animal[] animals = new Animal[3];
//        Scanner scanner = new Scanner(System.in);
//        for (int i=0;i<animals.length;i++){
//            System.out.println("Введите тип животного: 1-Собака, 2-Кошка, 3-Птица");
//            int type = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Введите имя: ");
//            String name = scanner.nextLine();
//
//            System.out.println("Введите возраст: ");
//            int age = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("Введите вес: ");
//            int weight = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (type){
//                case 1:
//                    animals[i] = new Dog(name, age, weight);
//                    break;
//                case 2:
//                    animals[i] = new Cat(name, age, weight);
//                    break;
//                case 3:
//                    animals[i] = new Bird(name, age, weight);
//                    break;
//            }
//        }
//        for (Animal animal : animals) {
//            animal.makeSound();
//            animal.eat(2);
//        }
    }
}
