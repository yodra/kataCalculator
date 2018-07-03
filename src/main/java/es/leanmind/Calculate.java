package es.leanmind;

public class Calculate {

    private static final String NUMBER_SEPARATOR = ",";

    public Integer sumStr(String numbers) {
        Integer result = 0;

        if (numbers.length() == 1) {
            result = Integer.parseInt(numbers);
        } else {

            String[] numberList = numbers.split(NUMBER_SEPARATOR);

            for (String number : numberList) {
                result += Integer.parseInt(number);
            }
        }

        return result;
    }
}
