package com.epam.moduleTestNG;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SqrtCalculatorTest extends BaseCalculatorTest {

    @Test
    public void testSqrt(){
        double result = calculator.sqrt(1);
        System.out.println("Sqrt(" + 1 + ") = " + result);
        Assert.assertEquals(result, 1.0);
    }

    @Test(groups = "one")
    @Parameters({"a", "expected"})
    public void testSqrt(double a, double expected){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expected, "Sqrt(" + a + ") is NOT equal " + result);
    }
}
