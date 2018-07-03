package es.leanmind;

import org.apache.commons.lang3.StringUtils;

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
        Integer result = 0;

        for (String number : numbers) {
            if (StringUtils.isNumeric(number)) {
                result += Integer.parseInt(number);
            }
        }

        return result;
    }
}
