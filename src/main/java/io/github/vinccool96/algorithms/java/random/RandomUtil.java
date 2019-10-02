package io.github.vinccool96.algorithms.java.random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class RandomUtil {

    private static RandomUtil instance;

    public static RandomUtil getInstance() {
        if (instance == null) {
            instance = new RandomUtil();
        }
        return instance;
    }

    private RandomUtil() {
    }

    public <T> T random(T[] array) {
        int index = random(array.length);
        return array[index];
    }

    public <T> T random(T[] array, int lowerBound, int upperBound) {
        int index = random(array.length);
        return array[index];
    }

    public <T> T random(Collection<T> collection, int lowerBound, int upperBound) {
        ArrayList<T> arrayList = new ArrayList<>(collection);
        int index = random(arrayList.size());
        return arrayList.get(index);
    }

    public <T> T random(Collection<T> collection) {
        ArrayList<T> arrayList = new ArrayList<>(collection);
        int index = random(arrayList.size());
        return arrayList.get(index);
    }

    public int random(int size) {
        Random random = new Random();
        return random.nextInt(size);
    }

    public int random(int lowerBound, int upperBound) {
        int delta = upperBound - lowerBound;
        return random(delta) + lowerBound;
    }

}
