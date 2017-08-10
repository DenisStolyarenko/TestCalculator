package com.epam.moduleJUnit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CosCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1},
                {30, 0.8660},
                {45, 0.7071},
                {60, 0.5},
                {90, 0},
                {180, -1},
                {270, 0},
                {360, 1},
        });
    }

    public CosCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testCos() {
        double result = round(calculator.cos(Math.toRadians(a)));
        Assert.assertEquals("Cos(" + a + ") = is NOT equal " + result, expected, result, 0);
    }
}
