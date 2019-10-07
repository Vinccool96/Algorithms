package io.github.vinccool96.algorithms;

import io.github.vinccool96.algorithms.array.ArrayUtilTest;
import io.github.vinccool96.algorithms.list.ListUtilTest;
import io.github.vinccool96.algorithms.range.RangeTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@SuiteClasses({ ArrayUtilTest.class, ListUtilTest.class, RangeTest.class })
public class AllTests {
}
