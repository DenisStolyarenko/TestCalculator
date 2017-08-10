package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SqrtCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double expected;

    public SqrtCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {25,5},
                {121,11},
                {0, 0}
        });
    }

    @Test
    public void testSqrt(){
        double result = calculator.sqrt(a);
        Assert.assertEquals("Sqrt(" + a + ") is NOT equal " + result, expected, result, 0);
    }
}
