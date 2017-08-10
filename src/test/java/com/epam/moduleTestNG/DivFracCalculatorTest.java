package com.epam.moduleTestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivFracCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "divDataProvider")
    public DivFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProvider() {
        return new Object[][]{
                {5, 1, 5},
                {0, 7, 0},
                {35, 8, 4.375},
                {-1569, 4, -392.25}
        };
    }

    @Test
    public void testFracDiv() {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected, a + " / " + b + " is NOT equal " + result);
    }
}
