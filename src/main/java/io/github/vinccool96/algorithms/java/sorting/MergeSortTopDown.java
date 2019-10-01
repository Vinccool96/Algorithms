package io.github.vinccool96.algorithms.java.sorting;

import io.github.vinccool96.algorithms.java.list.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class MergeSortTopDown extends MergeSort {

    private static MergeSortTopDown instance;

    public static MergeSortTopDown getInstance() {
        if (instance == null) {
            instance = new MergeSortTopDown();
        }
        return instance;
    }

    private MergeSortTopDown() {
    }

    protected <T extends Comparable<T>> void mergeSort(List<T> list, ArrayList<T> workList, int n) {
        ListUtil.getInstance().copyList(list, workList);
        topDownSplitMerge(workList, list, 0, n);
    }

    private <T extends Comparable<T>> void topDownSplitMerge(List<T> list1, List<T> list2, int indexBegin,
            int indexEnd) {
        if (indexEnd - indexBegin >= 2) {
            int indexMiddle = (indexEnd + indexBegin) / 2;
            topDownSplitMerge(list2, list1, indexBegin, indexMiddle);
            topDownSplitMerge(list2, list1, indexMiddle, indexEnd);
            merge(list1, list2, indexBegin, indexMiddle, indexEnd);
        }
    }

}
