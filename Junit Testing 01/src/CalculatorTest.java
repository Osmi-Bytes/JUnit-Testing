import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        // Test addition
        int result = calculator.add(5, 3);
        assertEquals(8, result); // Expected result: 8
    }

    @Test
    public void testSubtract() {
        // Test subtraction
        int result = calculator.subtract(10, 4);
        assertEquals(6, result); // Expected result: 6
    }

    // Add more test methods for other scenarios (e.g., edge cases)

    @Test
    public void testNegativeNumbers() {
        int result = calculator.add(-5, -3);
        assertEquals(-8, result); // Expected result: -8
    }
}
