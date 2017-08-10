package com.epam.moduleTestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static java.lang.Math.round;

public class SubFracCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "subDataProvider")
    public SubFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] subDataProvider() {
        return new Object[][]{
                {1.8, 1.6, 0.2},
                {78.3, 1.85, 76.45},
                {0, 0, 0}
        };
    }

    @Test
    public void testFracSub() {
        double result = round(calculator.sub(a, b));
        Assert.assertEquals(result, expected, a + " - " + b + " is NOT equal " + result);
    }
}
