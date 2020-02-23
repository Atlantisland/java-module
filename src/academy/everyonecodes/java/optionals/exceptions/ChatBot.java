package academy.everyonecodes.java.optionals.exceptions;

import java.util.List;

public class ChatBot {

    public void handle(String command) {
        List<String> commands = List.of(command.split(" "));
        try {
            String firstArgument = handleFirstArgument(commands.get(0));
            String secondArgument = handleSecondArgument(commands.get(1).toLowerCase(), commands.get(0));
            System.out.println(firstArgument + " " + secondArgument);
        } catch (WrongFirstArgumentException | WrongSecondArgumentException error) {
            System.out.println(error.getMessage());
        }
    }

    String handleFirstArgument(String firstArgument) throws WrongFirstArgumentException {
        if (firstArgument.equals("temperature")) {
            return "Temperature";
        } else if (firstArgument.equals("lights")) {
            return "Lights switched";
        }
        throw new WrongFirstArgumentException(firstArgument);
    }

    String handleSecondArgument(String secondArgument, String firstArgument) throws WrongSecondArgumentException {
        if (firstArgument.equals("temperature")) {
            try {
                int temperatureValue = Integer.parseInt(secondArgument);
                if (temperatureValue < 25 && temperatureValue > 0) {
                    return "raised by " + secondArgument;
                } else if (temperatureValue < 0 && temperatureValue > -25) {
                    return "lowered by " + Math.abs(temperatureValue);
                }
            } catch (NumberFormatException e) {
                throw new WrongSecondArgumentException(secondArgument);
            }
        } else if (firstArgument.equals("lights")) {
            if (secondArgument.equals("on") || secondArgument.equals("off")) {
                return secondArgument;
            }
        }
        throw new WrongSecondArgumentException(secondArgument);
    }
}

