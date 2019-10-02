package io.github.vinccool96.algorithms.java.array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayUtilTest {

    private String[] strings;

    @Before
    public void setUp(){
        strings = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};
    }

    @Test
    public void toListEmptyArrayList() {
        ArrayList<String> actual = new ArrayList<>();
        ArrayUtil.getInstance().toList(actual, strings);
        ArrayList<String> expected = expectedArrayList();
        String message = "array: " + Arrays.toString(strings);
        assertEquals(message, expected, actual);
    }

    @Test
    public void toListArrayList() {
        ArrayList<String> actual = new ArrayList<>();
        actual.add("69");
        ArrayUtil.getInstance().toList(actual, strings);
        ArrayList<String> expected = expectedArrayList();
        String message = "array: " + Arrays.toString(strings);
        assertFalse(actual.contains("69"));
        assertEquals(message, expected, actual);
    }

    @Test
    public void toListEmptyLinkedList() {
        LinkedList<String> actual = new LinkedList<>();
        ArrayUtil.getInstance().toList(actual, strings);
        LinkedList<String> expected = expectedLinkedList();
        String message = "array: " + Arrays.toString(strings);
        assertEquals(message, expected, actual);
    }

    @Test
    public void toListLinkedList() {
        LinkedList<String> actual = new LinkedList<>();
        actual.add("69");
        ArrayUtil.getInstance().toList(actual, strings);
        LinkedList<String> expected = expectedLinkedList();
        String message = "array: " + Arrays.toString(strings);
        assertFalse(actual.contains("69"));
        assertEquals(message, expected, actual);
    }

    private ArrayList<String> expectedArrayList(){
        return new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
            add("g");
            add("h");
            add("i");
            add("j");
            add("k");
            add("l");
            add("m");
            add("n");
            add("o");
            add("p");
            add("q");
            add("r");
            add("s");
            add("t");
            add("u");
            add("v");
            add("w");
            add("x");
            add("y");
            add("z");
        }};
    }

    private LinkedList<String> expectedLinkedList(){
        return new LinkedList<String>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
            add("g");
            add("h");
            add("i");
            add("j");
            add("k");
            add("l");
            add("m");
            add("n");
            add("o");
            add("p");
            add("q");
            add("r");
            add("s");
            add("t");
            add("u");
            add("v");
            add("w");
            add("x");
            add("y");
            add("z");
        }};
    }

}