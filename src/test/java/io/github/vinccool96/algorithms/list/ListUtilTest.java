package io.github.vinccool96.algorithms.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class ListUtilTest {

    @Test
    public void swap() {
        ArrayList<Integer> expectedArrayList = new ArrayList<Integer>() {{
            add(2);
            add(1);
        }};
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>() {{
            add(1);
            add(2);
        }};
        LinkedList<Integer> expectedLinkedList = new LinkedList<Integer>() {{
            add(1);
            add(2);
        }};
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>() {{
            add(2);
            add(1);
        }};
        ListUtil.getInstance().swap(integerArrayList, 0, 1);
        ListUtil.getInstance().swap(integerLinkedList, 1, 0);
        assertEquals(expectedArrayList, integerArrayList);
        assertEquals(expectedLinkedList, integerLinkedList);
    }

    @Test
    public void setOrAdd() {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(2);
        }};
        ListUtil.getInstance().setOrAdd(list, 0, 3);
        assertEquals(2, list.size());
        assertEquals(3, (int) list.get(0));
        ListUtil.getInstance().setOrAdd(list, 9, 42);
        assertEquals(2, (int) list.get(1));
        for (int i = 2; i < 9; i++) {
            assertNull(list.get(i));
        }
        assertEquals(10, list.size());
        assertEquals(42, (int) list.get(9));
    }

    @Test
    public void copyList_ListList() {
        ArrayList<String> expected = new ArrayList<String>() {{
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
        ArrayList<String> actual = new ArrayList<>();
        LinkedList<String> list =new LinkedList<String>(){{
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
        ListUtil.getInstance().copyList(list, actual);
        assertEquals(expected, actual);
        actual.add("984856");
        ListUtil.getInstance().copyList(list, actual);
        assertEquals(expected, actual);
    }

    @Test
    public void copyList_ListListInt() {
        ArrayList<String> expected = new ArrayList<String>() {{
            add("z");
            add("y");
            add("x");
            add("w");
            add("v");
            add("u");
            add("t");
            add("s");
            add("r");
            add("q");
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
        LinkedList<String> list =new LinkedList<String>(){{
            add("z");
            add("y");
            add("x");
            add("w");
            add("v");
            add("u");
            add("t");
            add("s");
            add("r");
            add("q");
            add("p");
            add("o");
            add("n");
            add("m");
            add("l");
            add("k");
            add("j");
            add("i");
            add("h");
            add("g");
            add("f");
            add("e");
            add("d");
            add("c");
            add("b");
            add("a");
        }};
        ArrayList<String> actual= new ArrayList<String>() {{
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
        ListUtil.getInstance().copyList(list, actual, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void copyList_ListListIntInt() {
        ArrayList<String> expectedFalse = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("w");
            add("v");
            add("u");
            add("t");
            add("s");
            add("r");
            add("q");
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
        ArrayList<String> expectedTrue = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("w");
            add("v");
            add("u");
            add("t");
            add("s");
            add("r");
            add("q");
            add("p");
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
        LinkedList<String> list =new LinkedList<String>(){{
            add("z");
            add("y");
            add("x");
            add("w");
            add("v");
            add("u");
            add("t");
            add("s");
            add("r");
            add("q");
            add("p");
            add("o");
            add("n");
            add("m");
            add("l");
            add("k");
            add("j");
            add("i");
            add("h");
            add("g");
            add("f");
            add("e");
            add("d");
            add("c");
            add("b");
            add("a");
        }};
        ArrayList<String> actual= new ArrayList<String>() {{
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
        ListUtil.getInstance().copyList(list, actual, 3, 10, false);
        assertEquals(expectedFalse, actual);
        actual= new ArrayList<String>() {{
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
        ListUtil.getInstance().copyList(list, actual, 3, 10, true);
        assertEquals(expectedTrue, actual);
    }

}