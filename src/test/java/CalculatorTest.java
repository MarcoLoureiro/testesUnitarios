import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    Calculator calculator;

    @BeforeEach
    void instantiateCalculator(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Testing add 1 + 2 = 3")
    void testAddition() {
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Multipling 1 * 1 = 1")
    void multiply() {
        int result = calculator.multiply(1, 1);
        assertEquals(1, result);
    }

    @Test
    void method(){
        // Nada
    }

    @Test
    @DisplayName("Testing if value1 = value2")
    void testEquality() {
        int value1 = 2;
        int value2 = 2;
        assertEquals(value1, value2);
    }

}