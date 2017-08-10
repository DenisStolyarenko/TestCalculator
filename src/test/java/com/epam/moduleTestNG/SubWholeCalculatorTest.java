package com.epam.moduleTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SubWholeCalculatorTest extends BaseCalculatorTest {
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "subDataProvider")
    public SubWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "subDataProvider")
    public static Object[][] subDataProvider() {
        return new Object[][]{
                {1, 1, 0},
                {1987, 125, 1862},
                {18, -31, 49},
                {0, 0, 0}
        };
    }

    @Test
    public void testIntSub() {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, a + " - " + b + " is NOT equal " + result);
    }
}
