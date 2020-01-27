package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class AdultChecker {

    public boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you 18 or older?");
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }
}

