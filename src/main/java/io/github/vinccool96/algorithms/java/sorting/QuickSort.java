package io.github.vinccool96.algorithms.java.sorting;

import java.util.List;

public class QuickSort {

    private static QuickSort instance;

    public static QuickSort getInstance() {
        if (instance == null) {
            instance = new QuickSort();
        }
        return instance;
    }

    private QuickSort() {
    }

    public <T extends Comparable<T>> void sort(List<T> list) {

    }

}
