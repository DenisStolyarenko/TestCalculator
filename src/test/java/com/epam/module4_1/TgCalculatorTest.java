package com.epam.module4_1;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TgCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double expected;

    @Factory(dataProvider = "tgDataProvider")
    public TgCalculatorTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @DataProvider(name = "tgDataProvider")
    public static Object[][] tgDataProvider(){
        return new Object[][]{
                {0,1},
                {30, 0.5774},
                {45, 1},
                {60, 1.7321},
                {180, 0},
                {360, 0}
        };
    }

    @Test
    public void testTg(){
        double result = round(calculator.tg(Math.toRadians(a)));
        System.out.println("Tg(" + a + ") = " + result);
        Assert.assertEquals(result, expected);
    }

    private double round (double value){
        return (double)Math.round(value * 10000d)/10000d;
    }
}
