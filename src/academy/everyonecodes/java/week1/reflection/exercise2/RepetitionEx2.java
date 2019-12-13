package academy.everyonecodes.java.week1.reflection.exercise2;

import java.util.Scanner;

public class RepetitionEx2 {
    public static void main(String[] args) {
        System.out.println("Say a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number < 1 || number > 10) {
            System.out.println("Say a number 1 and 10");
            number = scanner.nextInt();
        }
        System.out.println("Alright! Let's perform a trick with " + number);

    }
}
