import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testando adição de 2 + 1, com resultado esperado sendo 3")
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(1, 1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void method(){
        // Nada
    }

    @Test
    void testEquality() {
        int expected = 2;
        int actual = 3;

        assertEquals(2, 3);
    }

}