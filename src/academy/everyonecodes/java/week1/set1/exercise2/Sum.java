package academy.everyonecodes.java.week1.set1.exercise2;

public class Sum {
    public static int sumInt(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static double sumDouble(double numberOneDec, double numberTwoDec) {

        return numberOneDec + numberTwoDec;
    }

    public static void main(String[] args) {
        int numberOne = 8;
        int numberTwo = 12;
        int sumInt = sumInt(numberOne, numberTwo);
        System.out.println("The result is" + sumInt);
        double numberOneDec = 3.5;
        double numberTwoDec = 8.5;
        double sumDouble = sumDouble(numberOneDec, numberTwoDec);
        System.out.println("The result is" + sumDouble);
    }
}
