package academy.everyonecodes.java.week1.reflection.exercise1;

import java.lang.Math;

public class Exercise1 {

    public static int raiseToPower(int numberOne, int numberTwo) {
        return (int) Math.pow(numberOne, numberTwo);
        //int finalNumber = 0;
        //for(int i=1; i<=numberTwo; i++) {
        //   finalNumber = finalNumber+numberOne*numberOne;
    }


    public static void main(String[] args) {
        int result = raiseToPower(-1, 5);
        System.out.println("The result is " + result + ".");
    }


}
