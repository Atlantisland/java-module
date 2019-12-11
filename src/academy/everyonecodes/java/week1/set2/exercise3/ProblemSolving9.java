package academy.everyonecodes.java.week1.set2.exercise3;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ProblemSolving9 {

    public static boolean isBigger(int numberOne, int numberTwo) {
        boolean isBigger = true;
        if (numberOne < numberTwo) {
            isBigger = false;

        }

        return isBigger;

    }

    public static boolean isSmaller(int numberOne, int numberTwo) {
        boolean isSmaller = true;
        if (numberOne > numberTwo) {
            isSmaller = false;

        }

        return isSmaller;

    }

    public static int getBiggest(List<Integer> numbers) {
        int biggestNumber = numbers.get(0);
        int position = 1;
        while (position < numbers.size()) {
            if (isBigger(numbers.get(position), biggestNumber)) {
                biggestNumber = numbers.get(position);

            }

            position++;

        }

        return biggestNumber;
    }

    public static int getSmallest(List<Integer> numbers) {
        int smallestNumber = numbers.get(0);
        int position = 1;
        while (position < numbers.size()) {
            if (isSmaller(numbers.get(position), smallestNumber)) {
                smallestNumber = numbers.get(position);

            }
            position++;

        }

        return smallestNumber;

    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 4, 3, 0, 5, 2);
        int smallestNumber = getSmallest(numbers);
        int biggestNumber = getBiggest(numbers);
        System.out.println("The biggest number is " + biggestNumber + " and the smallest number is " + smallestNumber);

    }

}
