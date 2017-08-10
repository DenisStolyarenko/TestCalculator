package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubWholeCalculatorTest extends BaseCalculatorJUnitTest {
    private long a;
    private long b;
    private long expected;

    public SubWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 0},
                {1987, 125, 1862},
                {18, -31, 49},
                {0, 0, 0}
        });
    }

    @Test
    public void testIntSub() {
        long result = calculator.sub(a, b);
        Assert.assertEquals(a + " - " + b + " is NOT equal " + result, expected, result, 0);
    }
}
