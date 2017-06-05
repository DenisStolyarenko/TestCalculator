package com.epam.module4_1.runner;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTest {
    //protected Calculator calculator;

    //For Factory
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "sumDataProvider")
    public CalculatorTest(long a, long b, long expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
//    Simple test
//    @Test
//    public void testSum(){
//        Calculator calculator = new Calculator();
//        long sum = calculator.sum(5, 5);
//        Assert.assertEquals(sum, 10);
//    }

    // test with parameters
//    @Test
//    @Parameters({"a","b","expected"})
//    public void testSum2(long a, long b, long expected){
//        Calculator calculator = new Calculator();
//        long sum = calculator.sum(a, b);
//        Assert.assertEquals(sum, expected);
//    }

//    @Test (dataProvider = "sumDataProvider")
//    @Parameters({"a","b","expected"})
//    public void testSum3(long a, long b, long expected){
//        Calculator calculator = new Calculator();
//        long sum = calculator.sum(a, b);
//        Assert.assertEquals(sum, expected);
//    }

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        long sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expected);
    }

//    @DataProvider(name = "sumDataProvider")
//    public Object[][] sumDataProvider(){
//        return new Object[][]{
//                {1,1,2},
//                {0,0,0}
//        };
//    }

    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider(){
        return new Object[][]{
                {1,1,2},
                {0,0,0}
        };
    }
}
