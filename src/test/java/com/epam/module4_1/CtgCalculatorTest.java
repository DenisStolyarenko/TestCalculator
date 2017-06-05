package com.epam.module4_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class CtgCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double expected;

    @Factory(dataProvider = "ctgDataProvider")
    public CtgCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @DataProvider(name = "ctgDataProvider")
    public static Object[][] ctgDataProvider(){
        return new Object[][]{
                {30, 1.7321},
                {45, 1},
                {60, 0.5774},
                {90, 0},
                {270, 0}
        };
    }

    @Test
    public void testTg(){
        double result = round(calculator.ctg(Math.toRadians(a)));
        System.out.println("Ctg(" + a + ") = " + result);
        Assert.assertEquals(result, expected);
    }

    private double round (double value){
        return (double)Math.round(value * 10000d)/10000d;
    }
}
