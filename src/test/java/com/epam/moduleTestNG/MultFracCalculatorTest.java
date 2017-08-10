package com.epam.moduleTestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultFracCalculatorTest extends BaseCalculatorTest{
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "multDataProvider")
    public MultFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProvider() {
        return new Object[][]{
                {1, 1.6, 1.6},
                {0, 6.6, 0},
                {5.4, 9.9, 53.46},
                {-10.45, 93.2, -973.94}
        };
    }

    @Test
    public void testFracMult() {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, a + " * " + b + " is NOT equal " + result);
    }
}
