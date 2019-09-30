package io.github.vinccool96.algorithms.java.list;

import java.util.List;

public class Swap {

    private static Swap instance;

    public static Swap getInstance() {
        if (instance == null) {
            instance = new Swap();
        }
        return instance;
    }

    private Swap() {
    }

    public <T> void swap(List<T> list, int pos1, int pos2) {
        T temp = list.set(pos1, list.get(pos2));
        list.set(pos2, temp);
    }

}
