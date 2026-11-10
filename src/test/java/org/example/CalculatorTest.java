package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author sergio
 * @created 20/10/2026
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSquare(){
        System.out.println("square algorithm test");
        assertEquals(4,calculator.square(2));
        }
}

