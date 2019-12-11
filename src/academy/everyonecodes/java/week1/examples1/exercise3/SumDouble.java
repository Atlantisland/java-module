package academy.everyonecodes.java.week1.examples1.exercise3;

public class SumDouble {
    public static double sumDouble(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
        double numberOne = 7.2;
        double numberTwo = 16.8;
        double sum = sumDouble(numberOne, numberTwo);
        System.out.println("The result is" + sum);
    }
}
