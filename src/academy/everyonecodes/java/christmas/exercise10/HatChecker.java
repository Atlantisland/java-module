package academy.everyonecodes.java.christmas.exercise10;

import java.util.Scanner;

public class HatChecker {

    public boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you wearing a hat?");
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }

}
