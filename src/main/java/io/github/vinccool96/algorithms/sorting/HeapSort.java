package io.github.vinccool96.algorithms.sorting;

import io.github.vinccool96.algorithms.list.ListUtil;

import java.util.List;

public class HeapSort {

    private static HeapSort instance;

    public static HeapSort getInstance() {
        if (instance == null) {
            instance = new HeapSort();
        }
        return instance;
    }

    private HeapSort() {
    }

    public <T extends Comparable<T>> void sort(List<T> list) {
        int count = list.size();
        heapsort(list, count);
    }

    private <T extends Comparable<T>> void heapsort(List<T> list, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(list, size, i);
        }
        for (int i = size - 1; i >= 0; i--) {
            ListUtil.getInstance().swap(list, i, 0);
            heapify(list, i, 0);
        }
    }

    private <T extends Comparable<T>> void heapify(List<T> list, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < size && list.get(left).compareTo(list.get(largest)) > 0) {
            largest = left;
        }
        if (right < size && list.get(right).compareTo(list.get(largest)) > 0) {
            largest = right;
        }
        if (largest != i) {
            ListUtil.getInstance().swap(list, i, largest);
            heapify(list, size, largest);
        }
    }

    <T extends Comparable<T>> void heapSort(List<T> list, int begin, int end) {
        int heapN = end - begin;

        // Build heap (rearrange array)
        heapify(list, begin, end, heapN);

        // One by one extract an element from heap
        for (int i = heapN; i >= 1; i--) {

            // Move current root to end
            ListUtil.getInstance().swap(list, begin, begin + i);

            // call maxHeap() on the reduced heap
            maxHeap(list, 1, i, begin);
        }
    }

    private <T extends Comparable<T>> void heapify(List<T> list, int begin, int end, int heapN) {
        for (int i = (heapN) / 2; i >= 1; i--) {
            maxHeap(list, i, heapN, begin);
        }
    }

    private <T extends Comparable<T>> void maxHeap(List<T> list, int i, int heapN, int begin) {
        T temp = list.get(begin + i - 1);
        int child;

        while (i <= heapN / 2) {
            child = 2 * i;

            if (child < heapN && list.get(begin + child - 1).compareTo(list.get(begin + child)) < 0) {
                child++;
            }

            if (temp.compareTo(list.get(begin + child - 1)) >= 0) {
                break;
            }

            list.set(begin + i - 1, list.get(begin + child - 1));
            i = child;
        }
        list.set(begin + i - 1, temp);
    }

}
