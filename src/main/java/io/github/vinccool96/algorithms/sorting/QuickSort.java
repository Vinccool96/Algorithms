package io.github.vinccool96.algorithms.sorting;

import java.util.List;

abstract class QuickSort {

    public <T extends Comparable<T>> void sort(List<T> list) {

    }

    protected abstract  <T extends Comparable<T>>void quickSort(List<T> list, int low, int high);

    protected abstract <T extends Comparable<T>>int partition(List<T> list, int low, int high);

}
