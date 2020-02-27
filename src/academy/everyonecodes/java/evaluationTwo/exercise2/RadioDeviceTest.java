package academy.everyonecodes.java.evaluationTwo.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RadioDeviceTest {
    RadioDevice radioDevice = new RadioDevice();

    static Stream<Arguments> parameters() {

        return Stream.of(
                Arguments.of(Optional.of("Hallo world!"), new RadioMessage("Hallo world!", 1900)),
                Arguments.of(Optional.of("Goodmorning Vienna"), new RadioMessage("Goodmorning Vienna", 4200))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void receive(Optional<String> oExpected, RadioMessage radioMessage) {
        Optional<String> oResult = radioDevice.receive(radioMessage);
        Assertions.assertTrue(oResult.isPresent());
        assertEquals(oExpected.get(), oResult.get());
    }
    @Test
    void receiveNoMessage() {
        RadioMessage radioMessage = new RadioMessage("Have a great weekend!", 1500);

        Optional<String> oResult = radioDevice.receive(radioMessage);

        assertTrue(oResult.isEmpty());
    }

}



