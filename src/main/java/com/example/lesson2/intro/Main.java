package com.example.lesson2.intro;

import com.example.lesson1.Account;
import com.example.lesson1.DepositAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        //List, Set, Map, Queue, Deque, Collection
        // ArrayList, LinkedList, Stack, HashSet

        // class extends class
        // class implements interface1, interface2
        // interface extends interface1, interface2

        // Анонимные классы
        // Функциональный интерфейс

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        numbers.stream()
                .filter(x-> x>5)
                .map(String::valueOf)
                .map(x-> x.repeat(5))
                .forEach(System.out::println);


//        AbstractAccount myAccount = new AbstractAccount() {
//            @Override
//            protected boolean canPut(BigDecimal increase) {
//                return false;
//            }
//
//            @Override
//            protected boolean canTake(BigDecimal decrease) {
//                return false;
//            }
//        };

        List<Integer> list = new ArrayList<>();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000_000; i++) {
                    list.add(i);
                }
            }
        };

        Runnable lambda = () -> {
            for (int i = 0; i < 10_000_000; i++) {
                list.add(i);
            }
        };

        System.out.println(timer(runnable));

    }

    private static void functionalInterface(){
        //no args, no result -> Runnable
        Runnable action = () -> System.out.println("abcd");

        //no args, exist result -> Supplier
        Supplier<Integer> integerSupplier = () -> 1;
        Supplier<Account> accountSupplier = () -> new DepositAccount();

        // exist arg, no result -> Consumer
        String string1 = "sddf";
        Consumer<String> consumer = (string) -> System.out.println(string);

        // exist arg, exist result -> Function
        Function<String, Integer> function = str -> str.length();

    }

    private static long timer(Runnable runnable) {
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        return end - start;
    }



}
