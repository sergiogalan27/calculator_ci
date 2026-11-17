
package org.example;
/**
 * created Sergio
 * 17/11/2026
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSquare() {

        System.out.println("Square algorithm test");

        assertEquals(25, calculator.square(5));
        assertEquals(4, calculator.square(2));
    }

    @Test
    public void testSquareFloat() {

        System.out.println("Square float algorithm test");

        assertEquals(6.25f, calculator.square(2.5f), 0.001);
    }

    @Test
    public void testSum() {

        System.out.println("Sum algorithm test");

        assertEquals(6, calculator.sum(4, 2));
    }

    @Test
    public void testSumDouble() {

        System.out.println("Sum double algorithm test");

        assertEquals(6.5, calculator.sum(4.0, 2.5), 0.001);
    }

    @Test
    public void testExponential() {

        System.out.println("Exponential algorithm test");

        assertEquals(8.0f, calculator.exponential(2.0f, 3), 0.001);
    }
}

