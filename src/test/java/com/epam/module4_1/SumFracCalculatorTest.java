package com.epam.module4_1;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumFracCalculatorTest extends BaseCalculatorTest{
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "sumDataProvider")
    public SumFracCalculatorTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider(){
        return new Object[][]{
                {1.5,1.5,3},
                {1.5,0,1.5},
                {100.34,23,123.34},
                {100.34,-23.5,76.84},
                {0,-8,-8},
                {0,0,0}
        };
    }

    @Test
    public void testFracSum(){
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }
}
