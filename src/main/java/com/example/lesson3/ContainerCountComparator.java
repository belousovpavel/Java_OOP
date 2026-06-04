package com.example.lesson3;

import java.awt.*;
import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Homework.Container> {
    @Override
    public int compare(Homework.Container o1, Homework.Container o2) {
        return o1.getBoxCount() - o2.getBoxCount();
    }

}
