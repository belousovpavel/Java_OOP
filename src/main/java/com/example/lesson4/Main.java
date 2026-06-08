package com.example.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Generic - Обобщение
        // T - type
        // E - element
        // K - key, V - value
        // P - parameter
        NumberStorage<Integer> integers = new NumberStorage<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        System.out.println(integers.sum());

        NumberStorage<Double> doubles = new NumberStorage<>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        System.out.println(doubles.sum());




        List<Integer> numbers = integers.getAllNumbers();
        System.out.println(numbers);

        List<Double> allNumbers = doubles.getAllNumbers();
        System.out.println(allNumbers);

    }
}
