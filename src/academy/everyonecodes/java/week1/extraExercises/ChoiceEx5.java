package academy.everyonecodes.java.week1.extraExercises;

import java.util.Scanner;

public class ChoiceEx5 {

    public static boolean isWearingAHat() {
        System.out.println("Are you wearing a hat?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean isWearingAHat = true;
        if (!answer.equals("yes")) {
            isWearingAHat = false;

        }

        return isWearingAHat;
    }

    public static boolean isBringningAPet() {
        System.out.println("Are you brining a pet?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean isBringingAPet = true;
        if (!answer.equals("yes")) {
            isBringingAPet = false;

        }

        return isBringingAPet;

    }

    public static void main(String[] args) {
        boolean isWearingAHat = isWearingAHat();
        boolean isBringningAPet = isBringningAPet();
        if (!isWearingAHat && !isBringningAPet) {
            System.out.println("Welcome to our cinema, how many I assist you?");
        }
        if (isWearingAHat || isBringningAPet) {
            System.out.println("I am sorry, but you are not allowed to enter");
        }
    }
}
