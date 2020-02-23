package academy.everyonecodes.java.optionals.exceptions;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        ChatBot chatBot = new ChatBot();
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        chatBot.handle(command);
    }
}
