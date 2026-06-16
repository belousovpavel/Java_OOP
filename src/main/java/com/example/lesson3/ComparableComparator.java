package com.example.lesson3;

import java.util.*;

public class ComparableComparator {
    // Comparator, Comparable
    public static void main(String[] args) {

        Set<Integer> integers = new TreeSet<>(Arrays.asList(4,3,2,5,1));

        String s11 ="aaa";
        String s1 = "aa";
        String s3 = "ccc";
        String s2 = "ddddddd";
        String s4 = "bbbbbb";


        Set<String> strings = new TreeSet<>(Arrays.asList(s1,s2,s3, s4,s11));

        System.out.println(integers);
        System.out.println(strings);
        System.out.println(s1.compareTo(s11));

        // Comparable
//        Set<Person> persons = new TreeSet<>(Arrays.asList(new Person(12),new Person(34),new Person(23)));
//        System.out.println(persons);

       //Comparator
        Set<String> comparator = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        comparator.addAll(Arrays.asList(s1,s2,s3,s4));
        System.out.println(comparator);


        Set<String> stringsLength = new TreeSet<>(new StringLengthComparator());
        stringsLength.addAll(Arrays.asList(s1,s2,s3,s4));

        System.out.println(stringsLength);

        Set<Person> personAge = new TreeSet<>(new PersonAgeComparator());
        personAge.addAll(Arrays.asList(new Person(13),new Person(33),new Person(24)));

        System.out.println(personAge);

    }

    static class StringLengthComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }

    static class Person{

        private final int age;

        public Person(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

//        @Override
//        public int compareTo(Person another) {
//            return -(age-another.age);
//        }

        @Override
        public String toString() {
            return "[" + age + "]";
        }
    }



    static class PersonAgeComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }



}
