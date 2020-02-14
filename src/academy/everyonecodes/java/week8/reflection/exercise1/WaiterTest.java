package academy.everyonecodes.java.week8.reflection.exercise1;

import academy.everyonecodes.java.week8.reflection.exercise1.cutlery.Cutlery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class WaiterTest {
    Waiter waiter = new Waiter();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("fork", "knife"), "Fish"),
                Arguments.of(List.of("spoon"), "Soup"),
                Arguments.of(List.of(), "")
        );

    }
    @ParameterizedTest
    @MethodSource("parameters")
    void getCutlery(List<Cutlery> expected, String dishName){
        List<Cutlery> result = waiter.getCutlery(dishName);

        Assertions.assertEquals(expected, result);
    }

}





