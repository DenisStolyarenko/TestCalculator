package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultFracCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double b;
    private double expected;

    public MultFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1.6, 1.6},
                {0, 6.6, 0},
                {5.4, 9.9, 53.46},
                {-10.45, 93.2, -973.94}
        });
    }

    @Test
    public void testFracMult() {
        double result = calculator.mult(a, b);
        Assert.assertEquals(a + " * " + b + " is NOT equal " + result,expected,result,0);
    }
}
