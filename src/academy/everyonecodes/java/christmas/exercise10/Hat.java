package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class Hat {

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

}
