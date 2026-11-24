package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sergio
 * @created 17/11/2026
 */
public class CalculatorStaticMethodTests {

    @Test
    public void testSumInt() {
        assertEquals(47, Calculator2.sum(23, 24));
    }

    @Test
    public void testSumIntNegativos() {
        assertEquals(-5, Calculator2.sum(-2, -3));
    }

    @Test
    public void testSumDouble() {
        // El tercer parámetro es la tolerancia permitida en decimales
        assertEquals(5.5, Calculator2.sum(2.5, 3.0), 0.001);
    }

    @Test
    public void testSquare() {
        assertEquals(25, Calculator2.square(5));
    }
}
