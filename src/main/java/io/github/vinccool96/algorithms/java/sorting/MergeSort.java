package io.github.vinccool96.algorithms.java.sorting;

import java.util.ArrayList;
import java.util.List;

abstract class MergeSort {

    public <T extends Comparable<T>> void sort(List<T> list) {
        ArrayList<T> workList = new ArrayList<T>();
        mergeSort(list, workList, list.size() - 1);
    }

    protected abstract <T extends Comparable<T>> void mergeSort(List<T> list, ArrayList<T> workList, int n);

    protected <T extends Comparable<T>> void merge(List<T> list1, List<T> list2, int indexBegin, int indexMiddle,
            int indexEnd){
        int i = indexBegin;
        int j = indexMiddle;
        for (int k = indexBegin; k < indexEnd; k++) {
            if (i < indexMiddle && (j >= indexEnd || list1.get(i).compareTo(list1.get(j)) <= 0)) {
                list2.set(k, list1.get(i));
                i++;
            } else {
                list2.set(k, list1.get(j));
                j++;
            }
        }
    }

}
