package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AdvancedThiefTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int expected,Safe safe) {
        AdvancedThief advancedThief = new AdvancedThief();
        advancedThief.open(safe);

        Assertions.assertEquals(expected, safe.getDifficultyPoints());
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(-2, new Safe(0, 3)),
                Arguments.of(50, new Safe(52, 36))
        );
    }
}