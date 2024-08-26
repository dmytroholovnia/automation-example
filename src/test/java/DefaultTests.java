import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultTests {

    private static final Calculator calculator = new Calculator();

    @DisplayName("Positive tests")
    @ParameterizedTest
    @CsvSource({"4, 2, 2", "7, 5, 2"})
    public void someTest(int expected, int firstNumber, int secondNumber) {
        assertEquals(expected, calculator.sum(firstNumber, secondNumber));
    }

    @DisplayName("Negative test")
    @Test
    public void negativeTest() {
        assertEquals(9, calculator.square(4));
    }

}
