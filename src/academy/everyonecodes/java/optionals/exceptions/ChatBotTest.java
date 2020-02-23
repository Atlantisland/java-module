package academy.everyonecodes.java.optionals.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ChatBotTest {
    ChatBot chatBot = new ChatBot();

    @ParameterizedTest
    @CsvSource({
            "Temperature, temperature",
            "Lights switched, lights"
    })
    void handleFirstArgumentValid(String expected, String firstArgument) throws WrongFirstArgumentException {
        String result = chatBot.handleFirstArgument(firstArgument);
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @CsvSource({
            "bla",
            "''",
            "Temperature",
            "Lights"

    })
    void handleFirstArgumentNonValid(String firstArgument) throws WrongFirstArgumentException {
        Assertions.assertThrows(WrongFirstArgumentException.class, () -> {
            chatBot.handleFirstArgument(firstArgument);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "raised by 2, 2, temperature",
            "lowered by 5, -5, temperature",
            "on, on, lights",
            "off, off, lights"
    })
    void handleSecondArgumentValid(String expected, String secondArgument, String firstArgument) throws WrongSecondArgumentException {
        Assertions.assertDoesNotThrow(() -> {
        });
    }

    @ParameterizedTest
    @CsvSource({
            "bla, temperature",
            "meh, lights",
            "bla, bla",
            "'', ''",
            "27, temperature",
            "-27, temperature"


    })
    void handleSecondArgumentNonValid(String secondArgument, String firstArgument) throws WrongSecondArgumentException {
        Assertions.assertThrows(WrongSecondArgumentException.class, () -> {
            chatBot.handleSecondArgument(secondArgument, firstArgument);
        });
    }
}