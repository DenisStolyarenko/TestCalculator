package com.epam.module4_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class isNegativeCalculatorTest extends BaseCalculatorTest{
    private long a;
    private boolean expected;

    @Factory(dataProvider = "isNegativeDataProvider")
    public isNegativeCalculatorTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @DataProvider(name = "isNegativeDataProvider")
    public static Object[][] isNegativeDataProvider(){
        return new Object[][]{
                {1,false},
                {-59,true},
                {0,false}
        };
    }

    @Test
    public void testIsNegative(){
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(result, expected);
    }
}
