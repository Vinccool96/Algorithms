package io.github.vinccool96.algorithms.sorting;

import io.github.vinccool96.algorithms.list.ListUtil;

import java.util.List;

public class QuickSortLomutoPartition extends QuickSort {

    private static QuickSortLomutoPartition instance;

    public static QuickSortLomutoPartition getInstance() {
        if (instance == null) {
            instance = new QuickSortLomutoPartition();
        }
        return instance;
    }

    private QuickSortLomutoPartition() {
    }

    protected <T extends Comparable<T>> void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int partition = partition(list, low, high);
            quickSort(list, low, partition - 1);
            quickSort(list, partition + 1, high);
        }
    }

    protected <T extends Comparable<T>> int partition(List<T> list, int low, int high) {
        T pivot = list.get(high);
        int i = low;
        for (int j = low; j <= high; j++) {
            if (list.get(j).compareTo(pivot)<0){
                ListUtil.getInstance().swap(list, i, j);
                i++;
            }
        }
        return i;
    }

}
