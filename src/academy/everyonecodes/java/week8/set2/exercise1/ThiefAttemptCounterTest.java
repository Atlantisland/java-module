package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThiefAttemptCounterTest {

    ThiefAttemptCounter counter = new ThiefAttemptCounter();

    @ParameterizedTest
    @MethodSource("parameters")
    void countAttempts(int expected, Thief thief) {
        Safe safe = new Safe("Basic", 4);

        int result = counter.countAttempts(thief, safe);

        assertEquals(expected, result);
    }

    static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(2, new AdvancedThief()),
                Arguments.of(4, new BeginnerThief())
        );
    }


}