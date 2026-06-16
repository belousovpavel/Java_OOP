package com.example.lesson3.HomeWork;

import java.util.Comparator;

public class ContainerComparator {

    public static Comparator<Container> bySumWeight(){
        return Comparator.comparing(Container::getSumWeight);
    }

}
