import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    /**
     * "4" = 4
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

    private int sumNumbers(String expression) {        return 1;
    }
}
