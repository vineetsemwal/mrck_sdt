package com.maveric.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorIntegrationTest {
    Calculator calculator;

    @BeforeEach
    public void setup() {
        Adder adder = new Adder();
        calculator = new Calculator(adder);
    }

    @Test
    public void sum_1() {
        int expectation = 6;
        int result = calculator.sum(2, 4);
        Assertions.assertEquals(expectation, result);
    }
}
