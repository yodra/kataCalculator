package es.leanmind;

public class Calculate {

    public Integer sumStr(String numbers) {
        Integer result;

        if (numbers.length() == 1) {
            result = Integer.parseInt(numbers);
        } else {
            String valueOne = String.valueOf(numbers.charAt(0));
            String valueTwo = String.valueOf(numbers.charAt(2));

            result = Integer.parseInt(valueOne) + Integer.parseInt(valueTwo);
        }

        return result;
    }
}
