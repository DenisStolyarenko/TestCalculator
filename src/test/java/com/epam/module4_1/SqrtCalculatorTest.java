package com.epam.module4_1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SqrtCalculatorTest extends BaseCalculatorTest {
    private double a;
    private double expected;

    @Test
    public void testSqrt(){
        double result = calculator.sqrt(1);
        System.out.println("Sqrt(" + 1 + ") = " + result);
        Assert.assertEquals(result, 1.0);
    }

    @Test(groups = "one")
    @Parameters({"a","expected"})
    public void testSqrt(double a, double expected){
        double result = calculator.sqrt(a);
        System.out.println("Sqrt(" + a + ") = " + result);
        Assert.assertEquals(result, expected);
    }
}
