package com.example.lesson3;

import java.util.Comparator;

public class SortById implements Comparator<Homework.Container> {
    @Override
        public int compare(Homework.Container o1, Homework.Container o2) {
            return o1.getId().compareTo(o2.getId());
    }
}
