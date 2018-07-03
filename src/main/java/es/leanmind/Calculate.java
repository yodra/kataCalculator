package es.leanmind;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Stream;

public class Calculate {

    private static final String NUMBER_SEPARATOR = ",";

    public Integer sumStr(String numbers) {
        Integer result = 0;

        if (numbers.length() == 1) {
            result = Integer.parseInt(numbers);
        } else {

            String[] numberList = numbers.split(NUMBER_SEPARATOR);
            result = sumNumbers(numberList);
        }

        return result;

    }

    private Integer sumNumbers(String[] numbers) {

        return Arrays.stream(numbers)
                .filter(StringUtils::isNumeric)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
