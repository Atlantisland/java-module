package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class Password {

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
}
