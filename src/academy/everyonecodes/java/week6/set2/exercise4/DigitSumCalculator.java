package academy.everyonecodes.java.week6.set2.exercise4;

public class DigitSumCalculator {
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
