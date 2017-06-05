package com.epam.module4_1;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PowCalculatorTestWithParam extends BaseCalculatorTest{

    @Test(dataProvider = "powDataProvider")
    @Parameters({"a", "b","expected"})
    public void testPow(double a, double b, double expected){
        double result = calculator.pow(a,b);
        System.out.println(a + " ^ " + b + " = " + result);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "powDataProvider")
    public static Object[][] powDataProvider(){
        return new Object[][]{
                {5,0,1},
                {0,7,0},
                {-35.5,4,1588230.0625},
                {-15,3,-3375}
        };
    }
}
