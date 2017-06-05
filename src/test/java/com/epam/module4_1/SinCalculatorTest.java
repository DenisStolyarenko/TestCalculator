package com.epam.module4_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double expected;

    @Factory(dataProvider = "sinDataProvider")
    public SinCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @DataProvider(name = "sinDataProvider")
    public static Object[][] sinDataProvider(){
        return new Object[][]{
                {0,0},
                {30, 0.5},
                {45, 0.7071},
                {60, 0.8660},
                {90, 1},
                {180, 0},
                {270, -1},
                {360, 0}
        };
    }

    @Test
    public void testSin(){
        double result = round(calculator.sin(Math.toRadians(a)));
        System.out.println("Sin(" + a + ") = " + result);
        Assert.assertEquals(result, expected);
    }

    private double round (double value){
        return (double)Math.round(value * 10000d)/10000d;
    }
}
