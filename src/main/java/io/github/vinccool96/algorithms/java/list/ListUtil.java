package io.github.vinccool96.algorithms.java.list;

import java.util.List;

/**
 * Provides multiple useful functions for {@link List}s.
 */
public class ListUtil {

    private static ListUtil instance;

    public static ListUtil getInstance() {
        if (instance == null) {
            instance = new ListUtil();
        }
        return instance;
    }

    private ListUtil() {
    }

    /**
     * Swaps the elements at the indexes {@code index1} and {@code index2} in {@code list}.
     *
     * @param list the {@link List<T>} that will get its elements swapped
     * @param index1 the index of the first object to swap
     * @param index2 the index of the second object to swap
     * @param <T> the type of the objects in {@code list}
     */
    public <T> void swap(List<T> list, int index1, int index2) {
        T temp = list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    /**
     * If {@code list} is long enough so that {@link IndexOutOfBoundsException} isn't thrown when performing
     * {@link List#set(int, Object)}, then {@link List#set(int, Object)} will be performed on {@code list}. If it isn't,
     * {@link List#add(Object)} will be performed to add {@code null}, then {@code list.add(element)} so that
     * {@code element} will be at the index {@code index} in {@code list}.
     *
     * @param list the {@link List<T>} to which the element will be set or added to the specified position.
     * @param index the index of the element
     * @param element the element to put in the list
     * @param <T> the type of {@code element}
     *
     * @return if {@code list} was long enough to have something at the index {@code index}, the element that was
     * previously there will be returned, just like with {@link List#set(int, Object)}. If it wasn't, {@code null} will
     * be returned.
     */
    public <T> T setOrAdd(List<T> list, int index, T element) {
        T returned = null;
        if (index < list.size()) {
            returned = list.set(index, element);
        } else {
            while (list.size() < index) {
                list.add(null);
            }
            list.add(element);
        }
        return returned;
    }

    /**
     * Removes all the elements in {@code listTo} then puts all the elements of {@code listFrom} in {@code listTo}.
     *
     * @param listFrom the {@link List<T>} to copy to {@code listTo}
     * @param listTo the {@link List<T>} in which the elements of {@code listFrom} are put.
     * @param <T> the type of the objects in {@code list}
     */
    public <T> void copyList(List<T> listFrom, List<T> listTo) {
        listTo.clear();
        listTo.addAll(listFrom);
    }

    /**
     * Puts all the elements of {@code listFrom} in {@code listTo} up to the index {@code indexEnd}.
     *
     * @param listFrom the {@link List<T>} to copy to {@code listTo}
     * @param listTo the {@link List<T>} in which the elements of {@code listFrom} are put.
     * @param <T> the type of the objects in {@code list}
     */
    public <T> void copyList(List<T> listFrom, List<T> listTo, int indexEnd) {
        if (indexEnd >= listFrom.size()) {
            String s = "indexEnd can't be greater or equal to listFrom.size()";
            throw new IllegalArgumentException(s);
        }
        for (int i = 0; i < indexEnd; i++) {
            setOrAdd(listTo, i, listFrom.get(i));
        }
    }

    /**
     * Copies all the elements of {@code listFrom} in {@code listTo} from the index {@code indexStart} to
     * {@code indexEnd}. {@code indexEnd} is included if {@code endIncluded} is {@code true}.
     *
     * @param listFrom the {@link List<T>} to copy to {@code listTo}
     * @param listTo the {@link List<T>} in which the elements of {@code listFrom} are put.
     * @param indexStart the starting index of the elements to put in {@code listTo}
     * @param indexEnd the last index of the elements to put in {@code listTo}
     * @param endIncluded if {@code true}, {@code indexEnd} is included
     * @param <T> the type of the objects in {@code list}
     */
    public <T> void copyList(List<T> listFrom, List<T> listTo, int indexStart, int indexEnd, boolean endIncluded) {
        if (indexStart < 0 || indexStart >= listFrom.size() || indexEnd < 0 || indexEnd >= listFrom.size()) {
            String s = "";
            if (indexStart < 0) {
                s += "indexStart can't be smaller than 0.";
            } else if (indexStart >= listFrom.size()) {
                s += "indexStart can't be higher than listFrom.size().";
            }
            if (indexEnd < 0) {
                s += "indexEnd can't be smaller than 0.";
            } else if (indexEnd >= listFrom.size()) {
                s += "indexEnd can't be higher than listFrom.size().";
            }
            throw new IndexOutOfBoundsException(s);
        }
        if ((endIncluded && indexStart > indexEnd) || (!endIncluded && indexStart >= indexEnd) ||
                listFrom.size() != listTo.size()) {
            String s = listFrom.size() != listTo.size() ? "listFrom and listTo must be the same size" :
                    endIncluded ? "indexStart can't be higher than indexEnd" :
                            "indexStart can't be higher or equal to than indexEnd";
            throw new IllegalArgumentException(s);
        }
        for (int i = indexStart; i < (endIncluded ? indexEnd + 1 : indexEnd); i++) {
            setOrAdd(listTo, i, listFrom.get(i));
        }
    }

}
