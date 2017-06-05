package com.epam.module4_1;
        import com.epam.tat.module4.Calculator;
        import org.testng.annotations.*;

        import java.util.Date;

public class BaseCalculatorTest {
    protected Calculator calculator;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeClass()
    public void setUp(){
        System.out.println("Prepare instance of Calculator");
        calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }

    protected void checkTime(){
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
}
