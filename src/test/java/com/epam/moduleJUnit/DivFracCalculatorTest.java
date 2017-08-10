package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivFracCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double b;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {5, 1, 5},
                {0, 7, 0},
                {35, 8, 4.375},
                {-1569, 4, -392.25},
        });
    }

    public DivFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testFracDiv() {
        double result = calculator.div(a, b);
        Assert.assertEquals(a + " / " + b + " is NOT equal " + result, expected, result, 0);
    }


}
