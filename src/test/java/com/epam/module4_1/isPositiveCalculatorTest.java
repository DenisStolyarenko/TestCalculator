package com.epam.module4_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class isPositiveCalculatorTest extends BaseCalculatorTest {
    private long a;
    private boolean expected;

    @Factory(dataProvider = "isPositiveDataProvider")
    public isPositiveCalculatorTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @DataProvider(name = "isPositiveDataProvider")
    public static Object[][] isPositiveDataProvider(){
        return new Object[][]{
                {1,true},
                {-59,false},
                {0,false}
        };
    }

    @Test
    public void testIsPositive(){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expected);
    }
}
