import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import javax.swing.text.html.CSS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
// not realizing the needed assertion wasn't imported 
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTests {

    @Test
    void TestAdd() {
        var calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
        assertEquals(10, calculator.add(15, -5));
    }
    @Test
    void TestSubtract() {
        var calculator = new Calculator();
        assertEquals(16, calculator.subtract(20,4));
        assertEquals(10, calculator.subtract(5, -5));
    }
    @Test
    void TestMultiply() {
        var calculator = new Calculator();
        assertEquals(16, calculator.multiply(4,4));
        assertEquals(-16, calculator.multiply(4,-4));
        assertEquals(-16, calculator.multiply(-4,4));
        assertEquals(16, calculator.multiply(-4,-4));
    }
    @Test
    void TestMultiplyByZero() {
        var calculator = new Calculator();
        assertEquals(0, calculator.multiply(200, 0));
        assertEquals(0, calculator.multiply(0, 100));

    }
    @Test
    void TestDivision() {
        var calculator = new Calculator();
        assertEquals(20, calculator.divide(100, 5));
        assertEquals(-20, calculator.divide(100, -5));
        assertEquals(-20, calculator.divide(-100, 5));
        assertEquals(0, calculator.divide(0, 1234));
    }
    @Test
    void DivideByZero() {
        var calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(4,0));
    }
}
