package calculatorTest;

import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();


    @Test
    public void powerTruePositive(){
        assertEquals("Power operation for TP", 1024, calculator.power(2, 10), DELTA);
        assertEquals("Power operation for TP", 16, calculator.power(4, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power operation for FP", 9, calculator.power(2, 3), DELTA);
        assertNotEquals("Power operation for FP", 100, calculator.power(2, 10), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("factorial function for TP", 24, calculator.fact(4), DELTA);
        assertEquals("factorial function for TP", 2, calculator.fact(2), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("factorial function for FP", 120, calculator.fact(4), DELTA);
        assertNotEquals("factorial function for FP", 12, calculator.fact(5), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("square root function for TP", 9, calculator.sqroot(81), DELTA);
        assertEquals("square root function for TP", 10, calculator.sqroot(100), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("square root function for FP", 9, calculator.sqroot(3), DELTA);
        assertNotEquals("square root function for FP", 44, calculator.sqroot(9), DELTA);

    }

    @Test
    public void logTruePositive(){
        assertEquals("natural log function for TP", 0, calculator.naturalLog(1), DELTA);
        assertEquals("natural log function for TP", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("natural log function for FP", 9, calculator.naturalLog(4), DELTA);
        assertNotEquals("natural log function for FP", 100, calculator.naturalLog(3.2), DELTA);
    }




}