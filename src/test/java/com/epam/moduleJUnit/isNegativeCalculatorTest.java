package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class isNegativeCalculatorTest extends BaseCalculatorJUnitTest{
    private long a;
    private boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, false},
                {-59, true},
                {0, false}
        });
    }

    public isNegativeCalculatorTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }


    @Test
    public void testIsNegative(){
        boolean result = calculator.isNegative(a);
        Assert.assertEquals("The number" + a + " is not negative", expected, result);
    }
}
