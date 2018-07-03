package es.leanmind;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

public class Calculator {

    private static final String NUMBER_SEPARATOR = ",";

    public int sumStr(String numbers) {
        int result;

        if (numbers.length() == 1) {
            result = Integer.parseInt(numbers);
        } else {

            String[] numberList = numbers.split(NUMBER_SEPARATOR);
            result = sumNumbers(numberList);
        }

        return result;

    }

    private int sumNumbers(String[] numbers) {

        return Arrays.stream(numbers)
                .filter(StringUtils::isNumeric)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
