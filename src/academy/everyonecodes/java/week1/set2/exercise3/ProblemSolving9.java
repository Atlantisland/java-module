package academy.everyonecodes.java.week1.set2.exercise3;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ProblemSolving9 {

    public static boolean isBigger(int numberOne, int numberTwo) {
        return numberOne > numberTwo;

    }

    public static boolean isSmaller(int numberOne, int numberTwo) {
        return numberOne < numberTwo;

    }

    public static int getBiggest(List<Integer> numbers) {
        int biggest = numbers.get(0);
        for (int num : numbers) {
            if (isBigger(num, biggest)) {
                biggest = num;
            }
        }

        return biggest;
    }

    public static int getSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int num : numbers) {
            if (isSmaller(num, smallest)) {
                smallest = num;
            }
        }

        return smallest;

    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-1, 4, 3, 0, 5, 2);
        int smallestNumber = getSmallest(numbers);
        int biggestNumber = getBiggest(numbers);
        System.out.println("The biggest number is " + biggestNumber + " and the smallest number is " + smallestNumber);

    }

}
