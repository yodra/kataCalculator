import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    /**
     * "4" = 4 OK
     * "?" = 0 OK
     * "1,1" = 2 OK
     * "1,1,1" = 3 OK
     * "1,?" = 1 OK
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
    public void ignores_not_number_symbols() {
        assertEquals(1, sumNumbers("1,a"));
    }

    @Test
    public void sum_two_numbers_separated_with_comma() {
        assertEquals(2, sumNumbers("1,1"));
    }

    @Test
    public void sum_numbers_separated_with_comma() {
        assertEquals(3, sumNumbers("1,1,1"));
    }

    @Test
    public void sum_numbers_with_separator() {
        assertEquals(2, sumNumbers("//#;1#1"));
    }

    private int sumNumbers(String expression) {
        int result = 0;
        String[] tokens = getTokens(expression);

        for (String token : tokens) {
            if (isNumber(token)) {
                result += Integer.parseInt(token);
            }
        }

        return result;
    }

    private String[] getTokens(String expression) {
        String[] numbers = expression.split(",");

        if (hasCustomSeparator(expression)) {
            String separator = String.valueOf(expression.charAt(2));
            numbers          = expression.substring(4, expression.length()).split(separator);
        }

        return numbers;
    }

    private static boolean isNumber(String number) {
        return number.matches("\\d");
    }
    private static boolean hasCustomSeparator(String expression) {
        return (expression.length() > 1) && (expression.substring(0,2).equals("//"));
    }
}
