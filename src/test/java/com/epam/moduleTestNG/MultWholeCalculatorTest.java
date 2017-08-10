package com.epam.moduleTestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MultWholeCalculatorTest extends BaseCalculatorTest {
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "multDataProvider")
    public MultWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "multDataProvider")
    public static Object[][] multDataProvider() {
        return new Object[][]{
                {1, 1, 1},
                {0, 6, 0},
                {5, 9, 45},
                {-10, 7, -70}
        };
    }

    @Test
    public void testIntMult() {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, a + " * " + b + " is NOT equal " + result);
    }
}
