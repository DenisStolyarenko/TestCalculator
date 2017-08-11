package com.epam.moduleJUnit;

import com.epam.tat.module4.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseCalculatorJUnitTest {
    public static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        System.out.println("Prepare instance of Calculator");
        calculator = new Calculator();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    protected double round(double value) {
        value = value * 10000;
        int i = (int) Math.round(value);
        value = (double) i / 10000;
        return value;
    }
}
