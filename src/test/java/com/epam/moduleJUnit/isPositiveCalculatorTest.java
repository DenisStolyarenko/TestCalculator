package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class isPositiveCalculatorTest extends BaseCalculatorJUnitTest {
    private long a;
    private boolean expected;

    public isPositiveCalculatorTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, true},
                {-59, false},
                {0, false}
        });
    }

    @Test
    public void testIsPositive(){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals("The number " + a + " is not positive", result, expected);
    }
}
