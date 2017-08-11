package com.epam.moduleTestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class DivWholeCalculatorTest extends BaseCalculatorTest {
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "divDataProvider")
    public DivWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "divDataProvider")
    public static Object[][] divDataProvider() {
        return new Object[][]{
                {5, 1, 5},
                {0, 7, 0},
                {35, 8, 4},
                {-1569, 4, -392}
        };
    }

    @Test
    public void testIntDiv() {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expected, a + " / " + b + " is NOT equal " + result);
    }

    @Test(expectedExceptions = NumberFormatException.class, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void testDivByZero() {
        long result = calculator.div(a, 0);
        Assert.assertEquals(result, expected, "Divide by zero");
    }


}
