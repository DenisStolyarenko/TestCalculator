package com.epam.moduleTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class SumWholeCalculatorTest extends BaseCalculatorTest {
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "sumDataProvider")
    public SumWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 1, 2},
                {59, 1096, 1155},
                {0, 0, 0}
        };
    }

    @Test
    public void testIntSum() {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, a + " + " + b + " is NOT equal " + result);
    }

}
