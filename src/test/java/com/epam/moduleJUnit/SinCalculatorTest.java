package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SinCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {30, 0.5},
                {45, 0.7071},
                {60, 0.8660},
                {90, 1},
                {180, 0},
                {270, -1},
                {360, 0},
        });
    }

    public SinCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testSin() {
        double result = round(calculator.sin(Math.toRadians(a)));
        Assert.assertEquals("Sin(" + a + ") = is NOT equal" + result, expected, result, 0);
    }

}
