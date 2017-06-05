package com.epam.module4_1;

import com.epam.tat.module4.Timeout;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SinCalculatorTestSimple extends BaseCalculatorTest{

    @Test(groups = "smoke")
    public void testSin0(){
        Timeout.sleep(2);
        double result = round(calculator.sin(Math.toRadians(0)));
        System.out.println("Sin(" + 0 + ") = " + result);
        Assert.assertEquals(result, (double) 0);
    }

    @Test(dependsOnGroups = "smoke")
    public void testSin30(){
        Timeout.sleep(2);
        double result = round(calculator.sin(Math.toRadians(30)));
        System.out.println("Sin(" + 30 + ") = " + result);
        Assert.assertEquals(result, 0.5);
    }

    @Test(dependsOnGroups = "smoke")
    public void testSin45(){
        Timeout.sleep(2);
        double result = round(calculator.sin(Math.toRadians(45)));
        System.out.println("Sin(" + 45 + ") = " + result);
        Assert.assertEquals(result, 0.7071);
    }

    @Test(dependsOnGroups = "smoke")
    public void testSin60(){
        Timeout.sleep(2);
        double result = round(calculator.sin(Math.toRadians(60)));
        System.out.println("Sin(" + 60 + ") = " + result);
        Assert.assertEquals(result, 0.8660);
    }

    @Test(groups = "smoke")
    public void testSin90(){
        Timeout.sleep(2);
        double result = round(calculator.sin(Math.toRadians(90)));
        System.out.println("Sin(" + 90 + ") = " + result);
        Assert.assertEquals(result, (double) 1);
    }

    private double round (double value){
        return (double)Math.round(value * 10000d)/10000d;
    }
}
