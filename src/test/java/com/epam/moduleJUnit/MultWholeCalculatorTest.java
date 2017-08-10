package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultWholeCalculatorTest extends BaseCalculatorJUnitTest {
    private long a;
    private long b;
    private long expected;

    public MultWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {0, 6, 0},
                {5, 9, 45},
                {-10, 7, -70}
        });
    }

    @Test
    public void testIntMult() {
        long result = calculator.mult(a, b);
        Assert.assertEquals(a + " * " + b + " is NOT equal " + result, expected, result,0);
    }
}
