package com.maveric.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdderTest {
    Adder adder;

    @BeforeEach
    void setup(){
     adder = new Adder();
    }

    /**
     * scenario: inputs are positive
     * num1:1, num2: 2
     * expectation: 3
     */
    @Test
    public void add_1() {
        int expectation = 3;
        int result = adder.add(1, 2);
        assertEquals(expectation, result);
    }

    /**
     * scenario: inputs are negative
     * num1: -2, num2: -5
     * expectation: -7
     */
    @Test
    public void add_2() {

        int expectation = -7;
        int result = adder.add(-2, -5);
        assertEquals(expectation, result);
    }



}
