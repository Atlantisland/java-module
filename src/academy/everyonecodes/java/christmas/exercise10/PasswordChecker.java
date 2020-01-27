package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class PasswordChecker {

    public boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the secret password?");
        String answer = scanner.nextLine();
        return answer.equals("Hokopoko");

    }
}
