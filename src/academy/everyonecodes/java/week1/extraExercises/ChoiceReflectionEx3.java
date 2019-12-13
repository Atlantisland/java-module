package academy.everyonecodes.java.week1.extraExercises;

import java.util.Scanner;

public class ChoiceReflectionEx3 {

    public static boolean isAdult() {
        System.out.println("Are you 18 or older?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean isAdult = true;
        if (!answer.equals("yes")) {
            isAdult = false;

        }

        return isAdult;

    }

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

    public static boolean knowsSecretPassword() {
        System.out.println("What is the secret password?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String password = "Hokopoko";
        boolean knowsPassword = true;
        if (!answer.equals(password)) {
            knowsPassword = false;

        }

        return knowsPassword;

    }

    public static void main(String[] args) {
        boolean isAdult = isAdult();
        boolean isWearingAHat = isWearingAHat();
        boolean knowsPassword = knowsSecretPassword();
        if (isAdult && isWearingAHat && knowsPassword) {
            System.out.println("You can enter our club");
        }
        if (!isAdult || !isWearingAHat || !knowsPassword) {
            System.out.println("I am sorry, but you cannot enter our club.");
        }

    }

}
