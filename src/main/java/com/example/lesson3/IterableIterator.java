package com.example.lesson3;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class IterableIterator {
    //Iterator,Iterable

    public static void main(String[] args) {
//        intro();

        int[] array = {1,2,3,4,5,6};
        ArrayIterator arrayIterator = new ArrayIterator(array);

        while(arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());
        }
    }

    static class ArrayIterator implements Iterator<Integer>{

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
            if(hasNext()){
                int toReturn = array[cursor];
                cursor++;
                return toReturn;
            }
            throw new NoSuchElementException();
        }
    }

    private static void intro() {
        //List -> Collection -> Iterable

        // hasNext(); - возвращает boolean
        // next(); - возвращает next();

        Collection<String> strings = new ArrayList<>(Arrays.asList("1","2","3","4","5","6"));
        Iterator<String> stringsIterator = strings.iterator();


//        while(stringsIterator.hasNext()){
////            stringsIterator.next(); меняет ползунок
//            String next = stringsIterator.next();
//            System.out.println(next);
//        }


        // через StreamApi
//        strings.stream()
//                .map(x-> Integer.parseInt(x))
//                .filter(x -> x %2 == 0)
//                .forEach(System.out::println);


        MyBox box = new MyBox();
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());
        box.addApple(new Apple());

        for (Apple apple : box) {
            System.out.println(apple);
        }
    }

    static class MyBox implements Iterable<Apple>{
        private List<Apple> apples = new ArrayList<>();
        public void addApple(Apple apple){
            apples.add(apple);
        }

        @Override
        public Iterator<Apple> iterator() {
            return apples.iterator();
        }
    }

    static class Apple{
        int weight = ThreadLocalRandom.current().nextInt(1,10);

        @Override
        public String toString() {
            return "{" + weight + "}";
        }
    }



}
