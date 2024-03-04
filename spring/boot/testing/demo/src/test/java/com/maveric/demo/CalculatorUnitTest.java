package com.maveric.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorUnitTest {


    @Mock
    Adder adder;
    @Spy
    @InjectMocks
    Calculator calculator;

    @BeforeEach
    public void setup() {

    }

    @Test
    public void sum_1() {
        int expectation = 6;
        when(adder.add(2, 4)).thenReturn(6);
        int result = calculator.sum(2, 4);
        assertEquals(expectation, result);
        verify(adder).add(2, 4);
    }

    @Test
    public void multiplyBy10_1() {
        int expectation = 30;
        //when(calculator.multiply(3,10)).thenReturn(expectation);
        doReturn(expectation).when(calculator).multiply(3, 10);
        int result = calculator.multiplyBy10(3);
        assertEquals(expectation, result);
        verify(calculator).multiply(3,10);
    }
}
