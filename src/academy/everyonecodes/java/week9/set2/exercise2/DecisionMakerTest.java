package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Move.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Move.Paper;
import academy.everyonecodes.java.week9.set2.exercise2.Move.Rock;
import academy.everyonecodes.java.week9.set2.exercise2.Move.Scissors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecisionMakerTest {

    DecisionMaker decisionMaker = new DecisionMaker();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Player 1 wins", new Rock(), new Scissors()),
                Arguments.of("Player 1 wins", new Scissors(), new Paper()),
                Arguments.of("Player 1 wins", new Paper(), new Rock()),
                Arguments.of("Nobody wins", new Rock(), new Rock()),
                Arguments.of("Nobody wins", new Paper(), new Paper()),
                Arguments.of("Nobody wins", new Scissors(), new Scissors())

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void decide(String expected, Move move1, Move move2) {
        String result = decisionMaker.decide(move1, move2);

        assertEquals(expected, result);
    }

}

