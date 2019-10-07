package io.github.vinccool96.algorithms.range;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeTest {

    @Test
    public void iterator() {
        int expected = 0;
        for (int actual :new Range(8)) {
            assertEquals(expected, actual);
            expected++;
        }
        assertEquals(7, expected++);
        for (int actual :new Range(8, 16)) {
            assertEquals(expected, actual);
            expected++;
        }
        assertEquals(15, expected);
    }

}