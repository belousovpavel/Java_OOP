package com.example.lesson3;


import java.util.*;

public class Homework {

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

        Container c1 = new Container("bbb");
        c1.addBox(new Box(2));
        c1.addBox(new Box(2));
        c1.addBox(new Box(5));
        System.out.println("Общий вес первого: " + c1.getSumWeight());

        Container c2 = new Container("ccc");
        c2.addBox(new Box(2));
        c2.addBox(new Box(3));
        System.out.println("Общий вес второго: " + c2.getSumWeight());

        Container c3 = new Container("aaa");
        c3.addBox(new Box(2));
        c3.addBox(new Box(1));
        c3.addBox(new Box(1));
        c3.addBox(new Box(3));
        System.out.println("Общий вес третьего: " + c3.getSumWeight());

        List<Container> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Collections.sort(list);
        System.out.println("После сортировки Comparable");
        for (Container container : list) {
            System.out.println(container);
        }

        Collections.sort(list, new ContainerCountComparator());
        System.out.println("После сортировки Comparator");
        for (Container container : list) {
            System.out.println(container);
        }

        Collections.sort(list, new SortById());
        System.out.println("После сортировки Comparator SortById");
        for (Container container : list) {
            System.out.println(container);
        }





    }

    static class Box{
        private final int weight;

        public Box(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return weight + "";
        }
    }

    static class Container implements Comparable<Container>{
        private final List<Box> boxes;

        private final String id;

        public Container(String id) {
            this.id = id;
            this.boxes = new ArrayList<>();
        }

        void addBox(Box box){
            boxes.add(box);
        }

        int getSumWeight(){
            int sum = 0;
            for (Box box : boxes){
                sum += box.getWeight();
            }
            return sum;
        }

        int getBoxCount(){
            return boxes.size();
        }

        public String getId() {
            return id;
        }

        @Override
        public int compareTo(Container another) {
            return this.getSumWeight() - another.getSumWeight();
        }

        @Override
        public String toString() {
            return "Общий вес : " + getSumWeight() +
                    " Количество ящиков в контейнере " + getBoxCount() +
                    " Id контейнера " + getId();
        }
    }

}
