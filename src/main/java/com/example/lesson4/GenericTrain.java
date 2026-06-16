package com.example.lesson4;

import java.util.*;

public class GenericTrain {

    public static void main(String[] args) {


         Integer x = myMethod2(new HashMap<String, List<Integer>>());
         Double y = myMethod2(new HashMap<Integer, LinkedList<Double>>());


         Map<A,?> aMap = null;
         Map<B,?> bMap = null;

         copy(bMap, aMap);

    }


    // Метод, который принимает Map, у которого ключ как минимум B, а значение как минимум D.
    // Метод должен вернуть обьект типа ключа Map

    static <K extends B> K myMethod(Map<K, ? extends D> map){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Метод который принимает Map, у которой ключ любой, а значение - список обьектов типа Number
    // Метод возвращает тот тип Number, который указан в списке.
    // Integer x = mayMethod2(Map<String, List<Integer>> arg)
    // Double x = mayMethod2(Map<Integer, LinkedList<Double>> arg)

    static <K, V extends Number> V myMethod2(Map<K, ? extends List <V>> map){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Метод, который копирует одну Map в другую
    // PECS Produser extends, Consumer super
    // Поставщик екстендс, Потребитель супер
    static <K> void copy(Map<? extends K,?> source, Map<? super K,?> target){

    }


//    public static void main(String[] args) {
//        List<A> aList = new ArrayList<>();
//        List<B> bList = new ArrayList<>();
//        List<C> cList = new ArrayList<>();
//        List<D> dList = new ArrayList<>();
//        List<E> eList = new ArrayList<>();
//
//        copy(aList,aList); // ok
//        copy(aList,bList); // no
//        copy(aList,cList); // no
//        copy(aList,dList); // no
//        copy(aList,eList); // no
//
//        copy(bList,aList); // ok
//        copy(bList,bList); // ok
//        copy(bList,cList); // no
//        copy(bList,dList); // no
//        copy(bList,eList); // no
//
//        copy(cList,aList); // ok
//        copy(cList,bList); // ok
//        copy(cList,cList); // ok
//        copy(cList,dList); // no
//        copy(cList,eList); // no
//
//        copy(dList,aList);
//        copy(dList,bList);
//        copy(dList,cList);
//        copy(dList,eList);
//
//
//
//        copy(eList,aList);
//        copy(eList,bList);
//        copy(eList,cList);
//        copy(eList,dList);
//        copy(eList,eList);
//
//        A a = first(aList); // ok
//        B b = first(bList); // ok
//        C c = first(cList); // ok
//        D d = first(dList); // ok
//        E e = first(eList); // ok
//    }

//    // Копируем из source в target
//    // wildcard ?
//    // PECS Produser extends, Consumer super
//    // Поставщик екстендс, Потребитель супер
//    static <T> void copy(List<? extends T> source, List<? super T> target){
//         target.addAll(source);
//    }
//
//
//    static <T extends A> T first(List<T> list){
//        return list.get(0);
//    }

    class A{

    }
    class B extends A{

    }

    class C extends B{

    }
    class D extends C{

    }

    class E extends D{

    }


}
