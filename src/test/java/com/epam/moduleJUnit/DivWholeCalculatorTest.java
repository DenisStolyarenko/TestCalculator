package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivWholeCalculatorTest extends BaseCalculatorJUnitTest {
    private long a;
    private long b;
    private long expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 1, 5},
                {0, 7, 0},
                {35, 8, 4},
                {-1569, 4, -392},
        });
    }

    public DivWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testIntDiv() {
        double result = calculator.div(a, b);
        Assert.assertEquals(a + " / " + b + " is NOT equal " + result, expected, result, 0);
    }

    @Test(expected = NumberFormatException.class)
    public void testExceptionDivByZero() {
        long result = calculator.div(a, 0);
        Assert.assertEquals("Divide by zero", expected, result);
    }

}
