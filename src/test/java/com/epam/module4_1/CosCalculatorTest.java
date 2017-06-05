package com.epam.module4_1;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double expected;

    @Factory(dataProvider = "cosDataProvider")
    public CosCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @DataProvider(name = "cosDataProvider")
    public static Object[][] cosDataProvider(){
        return new Object[][]{
                {0,1},
                {30, 0.8660},
                {45, 0.7071},
                {60, 0.5},
                {90, 0},
                {180, -1},
                {270, 0},
                {360, 1}
        };
    }

    @Test
    public void testCos(){
        double result = round(calculator.cos(Math.toRadians(a)));
        System.out.println("Cos(" + a + ") = " + result);
        Assert.assertEquals(result, expected);
    }

    private double round (double value){
        return (double)Math.round(value * 10000d)/10000d;
    }
}
