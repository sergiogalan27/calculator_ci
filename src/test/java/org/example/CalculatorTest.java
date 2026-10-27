package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author sergio
 * @created 20/10/2026
 */
public class CalculatorTest {
    private Calculator calculator;
       @Test
        public void testSquare(){
            System.out.println("square algorithm test");
            assertEquals(3,calculator.square(2));
        }
    }

