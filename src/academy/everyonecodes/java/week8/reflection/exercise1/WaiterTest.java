package academy.everyonecodes.java.week8.reflection.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaiterTest {
    Waiter waiter = new Waiter();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(), ""),
                Arguments.of(List.of("Spoon"), "Soup"),
                Arguments.of(List.of("Fork","Knife" ), "Fish")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void prepareTable(List<String> expected, String food) {
        List<String> result = waiter.getCutlery(food);

        assertEquals(expected, result);
    }

}





