package academy.everyonecodes.java.week6.set2.exercise4;

import java.util.ArrayList;
import java.util.List;

public class DigitSumCalculator {
    /*public int calculate(int number) {
        List<Integer> digits = getDigits(number);
        return calculator.calculate(digits);
    }

    List<Integer> getDigits(int number) {
        String numberString = String.valueOf(number);
        List<String> numbersString = List.of(numberString.split(""));
        List<Integer> digits = new ArrayList<>();
        for (String digitString : numbersString) {
            int digit = Integer.valueOf(digitString);
            digits.add(digit);
        }
        return digits;
    }

     */
    public int calculate(int number) {
        return getSum(number);
    }

    static int getSum(int nubmer) {
        int sum = 0;
        while (nubmer != 0) {
            sum = sum + nubmer % 10;
            nubmer = nubmer / 10;
        }
        return sum;
    }
}

