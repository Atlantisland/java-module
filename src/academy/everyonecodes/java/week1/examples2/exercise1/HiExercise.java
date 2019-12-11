package academy.everyonecodes.java.week1.examples2.exercise1;

import java.util.Scanner;

public class HiExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Oh, hi " + name);
    }
}
