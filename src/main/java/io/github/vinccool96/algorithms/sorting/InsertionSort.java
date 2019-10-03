package io.github.vinccool96.algorithms.sorting;

import io.github.vinccool96.algorithms.list.ListUtil;

import java.util.List;

public class InsertionSort {

    private static InsertionSort instance;

    public static InsertionSort getInstance() {
        if (instance == null) {
            instance = new InsertionSort();
        }
        return instance;
    }

    private InsertionSort() {
    }

    public <T extends Comparable<T>> void sort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T x = list.get(i);
            for (int j = i - 1; j > 0 && list.get(j).compareTo(x) < 0; j++) {
                ListUtil.getInstance().swap(list, j, j - 1);
            }
        }
    }

}
