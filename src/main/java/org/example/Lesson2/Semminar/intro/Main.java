package org.example.Lesson2.Semminar.intro;

import org.example.Lesson1.AbstractAccount;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        // Интерфейсы
        // List, Set, Map, Queue, Collection
        //Class
        //Stack,ArrayList,LinkedList,HashMap,TreeMap,TreeSet

        // class EXTENDS class
        // class IMPLEMENTS interface1,interface2,interface3
        // interface EXTENDS interface1,interface2,interface3

        // Анонимный класс

        AbstractAccount myAccount = new AbstractAccount() {
            @Override
            protected boolean canPut(BigDecimal increase) {
                return false;
            }

            @Override
            protected boolean canTake(BigDecimal decrease) {
                return false;
            }
        };
        // Функциональный интерфейс

//        List<Object> myList = new List<>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Object> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Object get(int index) {
//                return null;
//            }
//
//            @Override
//            public Object set(int index, Object element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, Object element) {
//
//            }
//
//            @Override
//            public Object remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<Object> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<Object> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<Object> subList(int fromIndex, int toIndex) {
//                return List.of();
//            }
//        };

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        integers.stream()
                .filter(x-> x>5)
                .map(x-> String.valueOf(x))
                .map(x->x.repeat(5))
                .forEach(x -> System.out.println(x));


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

        System.out.println(timer(lambda));

    }

    private static void functionalInterface(){
//        no args,no result -> Runnable
        Runnable runnable = () -> {
            System.out.println("abcd");
        };

//        no args,exist result -> Supplier
        Supplier<Integer> integerSupplier = () -> 1;

//        exist args,no result -> Consumer
        Consumer<String> stringPrinterConsumer = arg -> System.out.println(arg);
       // Consumer<String> stringPrinterConsumer = System.out::println;
//        exist args,exist result -> Function
        Function<String, Integer> stringLengthFunction = String::length;
//        exist args,boolean result -> Predicate
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;

//        UnaryOperator
//        IntConsumer
    }


    private static long timer(Runnable runnable){
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        return end-start;
    }
}
