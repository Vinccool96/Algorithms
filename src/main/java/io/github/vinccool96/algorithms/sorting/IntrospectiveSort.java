package io.github.vinccool96.algorithms.sorting;

import java.util.List;

public class IntrospectiveSort {

    private static IntrospectiveSort instance;

    public static IntrospectiveSort getInstance() {
        if (instance == null) {
            instance = new IntrospectiveSort();
        }
        return instance;
    }

    private IntrospectiveSort() {
    }

//    public <T extends Comparable<T>> void sort(List<T> list) {
//        int depthLimit = 2 * (int) Math.floor(Math.log(list.size()));
//        introspectiveSort(list, depthLimit, 0, list.size());
//    }
//
//    private <T extends Comparable<T>> void introspectiveSort(List<T> list, int depthLimit, int start, int end) {
//        int size = list.size();
//        if (size<=16){
//            QuickSortLomutoPartition.getInstance().quickSort(list, start, end);
//        }else if (depthLimit==0){
//            HeapSort.getInstance().heapSort(list, start, end);
//        }else {
//
//        }
//    }

}
