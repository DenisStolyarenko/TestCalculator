package com.epam.moduleJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumWholeCalculatorTest extends BaseCalculatorJUnitTest {
    private long a;
    private long b;
    private long expected;

    public SumWholeCalculatorTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {59, 1096, 1155},
                {0, 0, 0}
        });
    }

    @Test
    public void testIntSum(){
        long result = calculator.sum(a, b);
        Assert.assertEquals(a + " + " + b + " is NOT equal " + result, expected, result, 0);
    }
}
