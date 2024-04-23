package com.junittesting.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void testAddition() {
        int result = calculatorService.add(1, 2);
        assertEquals(3, result, "1 + 3 should be 8");
    }
}
