package io.github.hexiangyuan.testdemo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import io.github.hexiangyuan.testdemo.Calculator;

/**
 * Creator:HeXiangYuan
 * Date  : 16-11-18
 */

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();

    }

    @Test
    public void testAdd() throws Exception {
        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testMultiPly() throws Exception {
        int value = calculator.multiply(2, 4);
        Assert.assertEquals(8, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideTest() {
        double divide = calculator.divide(2, 0);
        Assert.assertEquals(6, divide, 0.0);
    }
}
