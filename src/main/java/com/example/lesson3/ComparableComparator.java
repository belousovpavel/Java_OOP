package com.example.lesson3;

import java.util.*;

public class ComparableComparator {

    public static void main(String[] args) {

        //Comparable, Comparator

        Set<Integer> set = new TreeSet<>(Arrays.asList(4, 3, 5, 1));
        System.out.println(set);

        String s1 = "aaaaaaa";
        String s3 = "aaaaa";
        String s2 = "bbbbb";

        Set<String> stringSet = new TreeSet<>(Arrays.asList(s1, s2, s3));
        System.out.println(stringSet);

        System.out.println(s1.compareTo(s2));

        Set<Person> personSet = new TreeSet<>(
                Arrays.asList(new Person(10), new Person(12), new Person(9), new Person(11))
        );
        System.out.println(personSet);

        Set<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });




    }

    static class Person implements Comparable<Person> {

        private final int age;

        public Person(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            return age - o.age;
//            if (age == o.age){
//                return 0;
//            }
//            else if (age < o.age){
//                return -1;
//            }
//            else {
//                return 1;
//            }
        }
        @Override
        public String toString() {
            return "("  + age + ")";
        }
    }

}
