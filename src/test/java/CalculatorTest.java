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

    @Test
    public void sum_numbers_with_long_separator() {
        assertEquals(2, sumNumbers("//#$;1#$1"));
    }

    private static final String SEPARATOR = ",";
    private static final String CUSTOM_SEPARATOR = "//";

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
        String[] tokens = expression.split(SEPARATOR);

        if (hasCustomSeparator(expression)) {
            String separator = getSeparator(expression);
                   tokens    = tokensSplitter(expression, separator);
        }

        return tokens;
    }

    private static boolean isNumber(String number) {
        return number.matches("\\d");
    }

    private static boolean hasCustomSeparator(String expression) {
        return (expression.length() > 1) && (expression.substring(0,2).equals(CUSTOM_SEPARATOR));
    }

    private static String getSeparator(String expression) {
        return String.valueOf(expression.charAt(2));
    }

    private static String[] tokensSplitter(String expression, String separator) {
        return expression.substring(4, expression.length()).split(separator);
    }
}
