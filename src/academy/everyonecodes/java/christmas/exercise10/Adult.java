package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class Adult {
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
}

