package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author sergio
 * @crated 17/11/2026
 */
public class CalculatorStaticMethodTests {

    @Test
    public void testSum(){
      assertEquals(3,Calculator2.sum(23,24));

    }
}
