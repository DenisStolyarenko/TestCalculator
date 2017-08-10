package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CtgCalculatorTest extends BaseCalculatorJUnitTest {
    private double a;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {30, 1.7321},
                {45, 1},
                {60, 0.5774},
                {90, 0},
                {270, 0}
        });
    }

    public CtgCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testCtg() {
        double result = round(calculator.ctg(Math.toRadians(a)));
        Assert.assertEquals("Ctg(" + a + ") = is NOT equal " + result, expected, result, 0);
    }
}
