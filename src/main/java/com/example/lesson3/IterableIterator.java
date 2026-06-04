package com.example.lesson3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class IterableIterator {

    public static void main(String[] args) {

        intro();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayIterator arrayIterator = new ArrayIterator(array);

        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

    }

    private static void intro() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1,10));
        }
        System.out.println(list);

        // List <- Collection <- Iterable

        //Iterable -> iterator

        List<String> strings = new ArrayList(Arrays.asList("a", "b", "c"));

        Iterator<String> iterator = strings.iterator();

        for (String string : strings) {
            System.out.println(string);
        }

        MyBox box = new MyBox();
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());

        for (Apple apple : box) {
            System.out.println(apple);
        }

//        // a b c
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }
    }

    static class ArrayIterator implements Iterator<Integer> {

        private final int[] array;
        private int cursor = 0;

        public ArrayIterator(int[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return array[cursor++];
            }
//            int toReturn = array[cursor];
//            cursor++;
//            return toReturn;
            throw new NoSuchElementException();
        }
    }

    static class MyBox implements Iterable<Apple> {
        private List<Apple> apples = new ArrayList<>();
        public void add(Apple apple){
            apples.add(apple);
        }

        @Override
        public Iterator<Apple> iterator() {
            return apples.iterator();
        }
    }

    static class Apple{
        int weight = ThreadLocalRandom.current().nextInt(1, 10);

        @Override
        public String toString() {
            return weight + "";
        }
    }
}
