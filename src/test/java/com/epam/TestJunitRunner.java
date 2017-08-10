package com.epam;

import com.epam.moduleJUnit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SinCalculatorTest.class, CosCalculatorTest.class, TgCalculatorTest.class, CtgCalculatorTest.class,
        DivFracCalculatorTest.class, DivWholeCalculatorTest.class, isNegativeCalculatorTest.class,
        isPositiveCalculatorTest.class, MultFracCalculatorTest.class, MultWholeCalculatorTest.class,
        PowCalculatorTest.class, SqrtCalculatorTest.class, SubWholeCalculatorTest.class, SubFracCalculatorTest.class,
        SumWholeCalculatorTest.class, SumFracCalculatorTest.class})
public class TestJunitRunner {
}
