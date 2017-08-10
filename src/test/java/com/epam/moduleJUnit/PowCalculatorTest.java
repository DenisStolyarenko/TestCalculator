package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PowCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double b;
    private double expected;

    public PowCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 0, 1},
                {0, 7, 0},
                {-35.5, 4, 1588230.0625},
                {-15, 3, -3375}
        });
    }

    @Test
    public void testPow() {
        double result = calculator.pow(a, b);
        Assert.assertEquals(a + " ^ " + b + " is NOT equal " + result, expected, result, 0);
    }
}
