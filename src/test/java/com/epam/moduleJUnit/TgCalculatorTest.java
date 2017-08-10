package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TgCalculatorTest extends  BaseCalculatorJUnitTest {
    private double a;
    private double expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 1},
                {30, 0.5774},
                {45, 1},
                {60, 1.7321},
                {180, 0},
                {360, 0}
        });
    }

    public TgCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testTg(){
        double result = round(calculator.tg(Math.toRadians(a)));
        Assert.assertEquals("Tg(" + a + ") is NOT equal " + result, expected, result, 0);
    }
}
