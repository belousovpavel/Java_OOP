package com.example.lesson3.HomeWork;

import com.example.lesson3.ComparableComparator;

import java.util.*;

public class Main {

    /**
     * Создать класс Контейнер.
     * В контейнере могут быть ящики (класс Box)
     *
     * У каждого ящика есть вес.
     * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.
     *
     * 1. Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
     * 2. Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
     * 3. Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
     *
     * <code>
     *      Container c = new Container();
     *          for (Box box: c){
     *              box - это контейнер
     *          }
     * </code>
     */

    public static void main(String[] args) {

        Container c1 = new Container(1);
        c1.addBox(new Box(1));
        c1.addBox(new Box(2));
        c1.addBox(new Box(3));

        System.out.println(c1);

        Container c2 = new Container(2);
        c2.addBox(new Box(2));
        c2.addBox(new Box(3));
        c2.addBox(new Box(5));

        System.out.println(c2);

        Container c3 = new Container(3);
        c3.addBox(new Box(3));
        c3.addBox(new Box(1));
        c3.addBox(new Box(3));

        System.out.println(c3);

        List<Container> list = new ArrayList<>(Arrays.asList(c1,c2,c3));
        list.sort(ContainerComparator.bySumWeight());


    }
}
