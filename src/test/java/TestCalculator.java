import module3.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {

    @Test
    public void addsTwoNumbers() {
        Calculator calculator = new Calculator(10.0, 2.0, "+");
        calculator.calculate();
        assertEquals(12.0, calculator.getResult());
    }

    @Test
    public void subtractsTwoNumbers() {
        Calculator calculator = new Calculator(10.0, 2.0, "-");
        calculator.calculate();
        assertEquals(8.0, calculator.getResult());
    }

    @Test
    public void multipliesTwoNumbers() {
        Calculator calculator = new Calculator(10.0, 2.0, "*");
        calculator.calculate();
        assertEquals(20.0, calculator.getResult());
    }

    @Test
    public void dividesTwoNumbers() {
        Calculator calculator = new Calculator(10.0, 2.0, "/");
        calculator.calculate();
        assertEquals(5.0, calculator.getResult());
    }
}
