package io.github.vinccool96.algorithms.sorting;

import io.github.vinccool96.algorithms.list.ListUtil;

import java.util.ArrayList;
import java.util.List;

public class MergeSortBottomUp extends MergeSort {

    private static MergeSortBottomUp instance;

    public static MergeSortBottomUp getInstance() {
        if (instance == null) {
            instance = new MergeSortBottomUp();
        }
        return instance;
    }

    private MergeSortBottomUp() {
    }

    protected <T extends Comparable<T>> void mergeSort(List<T> list, ArrayList<T> workList, int n) {
        for (int width = 1; width < n; width *= 2) {
            for (int i = 0; i < n; i += 2 * width) {
                merge(list, workList, i, Math.min(i + width, n), Math.min(i + 2 * width, n));
            }
            ListUtil.getInstance().copyList(workList, list, n);
        }
    }

}
