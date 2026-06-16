package com.example.lesson3.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Container{
    private final List<Box> boxes;
    private final int id;



    public Container(int id) {
        this.id = id;
        this.boxes = new ArrayList<>();
    }

    public void addBox(Box box){
        boxes.add(box);
    }

    public int getId() {
        return id;
    }

    public int getSumWeight(){
        int sum = 0;
        for (Box box : boxes) {
            sum = sum + box.getWeight();
        }
        return sum;
    }

    public int getCount(){
        return boxes.size();
    }

    @Override
    public String toString() {
        return "Общий вес : " + getSumWeight() +
                " Количество ящиков в контейнере " + getCount() +
                " Id контейнера " + getId();
    }
}
