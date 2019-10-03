package io.github.vinccool96.algorithms.sorting;

import java.util.List;

public class QuickSortHoarePartition extends QuickSort {

    private static QuickSortHoarePartition instance;

    public static QuickSortHoarePartition getInstance() {
        if (instance == null) {
            instance = new QuickSortHoarePartition();
        }
        return instance;
    }

    private QuickSortHoarePartition() {
    }

    protected <T extends Comparable<T>> void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int partition = partition(list, low, high);
            quickSort(list, low, partition);
            quickSort(list, partition + 1, high);
        }
    }

    protected <T extends Comparable<T>> int partition(List<T> list, int low, int high) {
        int index = low + (high - low) / 2;
        T pivot = list.get(index);
        int i = low - 1;
        int j = high+1;
        do {
            i++;
            do {
                i++;
            } while (list.get(i).compareTo(pivot) < 0);
            do {
                j--;
            } while (list.get(j).compareTo(pivot) > 0);
        } while (i < j);
        return j;
    }

}
