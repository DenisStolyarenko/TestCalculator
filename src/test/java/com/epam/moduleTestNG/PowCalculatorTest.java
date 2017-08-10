package com.epam.moduleTestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "powDataProvider")
    public PowCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProvider() {
        return new Object[][]{
                {5, 0, 1},
                {0, 7, 0},
                {-35.5, 4, 1588230.0625},
                {-15, 3, -3375}
        };
    }

    @Test
    public void testPow() {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expected, a + " ^ " + b + " is NOT equal " + result);
    }
}
