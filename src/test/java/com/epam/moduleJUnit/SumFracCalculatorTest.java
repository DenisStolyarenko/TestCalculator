package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumFracCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double b;
    private double expected;

    public SumFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.5, 1.5, 3},
                {1.5, 0, 1.5},
                {100.34, 23, 123.34},
                {100.34, -23.5, 76.84},
                {0, -8, -8},
                {0, 0, 0}
        });
    }

    @Test
    public void testFracSum(){
        double result = calculator.sum(a, b);
        Assert.assertEquals(a + " + " + b + " is NOT equal " + result, expected, result, 0);
    }
}
