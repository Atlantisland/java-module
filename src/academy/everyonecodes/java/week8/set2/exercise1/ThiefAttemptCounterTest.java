package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ThiefAttemptCounterTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void test(int expected, Thief thief, Safe safe) {
        ThiefAttemptCounter counter = new ThiefAttemptCounter();
        thief.open(safe);

        Assertions.assertEquals(expected, counter.countAttempts(thief, safe));
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(51, new BeginnerThief(), new Safe(52, 36)),
                Arguments.of(2, new BeginnerThief(), new Safe(3, 12)),
                Arguments.of(25, new AdvancedThief(), new Safe(52, 36)),
                Arguments.of(1, new AdvancedThief(), new Safe(3, 12))
        );
    }

}