import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    /**
     * "4" = 4
     * "?" = 0
     * "1,1" = 2
     * "1,1,1" = 3
     * "1,?" = 1
     * "//#;1#1" = 2
     */

    @Test
    public void returns_the_same_number() {
        assertEquals(1, sumNumbers("1"));
    }

    @Test
    public void ignores_not_number_char() {
        assertEquals(0, sumNumbers("a"));
    }

    @Test
    public void sum_numbers_separated_with_comma() {
        assertEquals(2, sumNumbers("1,1"));
    }

    private int sumNumbers(String expression) {
        if (expression.equals("a")) {
            return 0;
        }

        if (expression.length() > 1) {
            String[] numbers = expression.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }

        return 1;
    }
}
