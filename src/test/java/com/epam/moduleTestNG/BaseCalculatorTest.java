package com.epam.moduleTestNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;


public class BaseCalculatorTest {
    protected Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeClass()
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }


    protected double round(double value) {
        value = value * 10000;
        int i = (int) Math.round(value);
        value = (double) i / 10000;
        return value;
    }
}
