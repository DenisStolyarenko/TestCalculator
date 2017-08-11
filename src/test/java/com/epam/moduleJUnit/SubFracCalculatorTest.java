package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubFracCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double b;
    private double expected;

    public SubFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1.8, 1.6, 0.2},
                {78.3, 1.85, 76.45},
                {0, 0, 0}
        });
    }

    @Test
    public void testFracSub() {
        double result = round(calculator.sub(a, b));
        Assert.assertEquals(a + " - " + b + " is NOT equal " + result, expected, result, 0);
    }
}
