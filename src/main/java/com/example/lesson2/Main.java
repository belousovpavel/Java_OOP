package com.example.lesson2;

import com.example.lesson1.AbstractAccount;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List, Set, Map, Queue, Deque, Collection
        // Stack, ArrayList, LinkedList, HashMap, TreeMap, TreeSat

        // class EXTENDS class
        // class IMPLEMENTS interface1, interface2
        // interface EXTENDS interface1, interface2

        // Анонимный класс
        // Функциональный интерфейс - один абстрактный метод, можно через лямбду
        List<Integer> list = new ArrayList<>();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //
                for (int i = 0; i < 100_000; i++) {
                    list.add(i);
                }
            }
        };

        Runnable lambda = () -> {
            for (int i = 0; i < 100_000; i++) {
                list.add(i);
            }
        };

        System.out.println(timer(lambda));

    }

    private static void functionalInterface(){
        // no args, no result -> Runnable
        Runnable runnable = () -> System.out.println("abcd");

        // no args, exists result -> Supplier
    }

    private static long timer(Runnable runnable){
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        return end - start;
    }


}
