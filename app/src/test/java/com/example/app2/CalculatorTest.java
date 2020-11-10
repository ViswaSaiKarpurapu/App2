package com.example.app2;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int actual=Calculator.add(10,20);
        int expected=30;
        assertEquals(actual,expected);
    }
}