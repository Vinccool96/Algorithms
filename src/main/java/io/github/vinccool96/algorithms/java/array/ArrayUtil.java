package io.github.vinccool96.algorithms.java.array;

import java.util.List;

public class ArrayUtil {

    private static ArrayUtil instance;

    public static ArrayUtil getInstance() {
        if (instance == null) {
            instance = new ArrayUtil();
        }
        return instance;
    }

    private ArrayUtil() {
    }

    /**
     * Removes all the elements of {@code list} then puts all the elements of {@code array} into {@code list}.
     * 
     * @param list the {@link List} that will contain all the elements
     * @param array the array copied to {@code list}
     * @param <T> the class of the objects in {@code array} and in {@code list}
     */
    @SuppressWarnings({"UseBulkOperation", "ManualArrayToCollectionCopy", "ForLoopReplaceableByForEach"})
    public <T> void toList(List<T> list, T[] array){
        list.clear();
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            list.add(element);
        }
    }

}
