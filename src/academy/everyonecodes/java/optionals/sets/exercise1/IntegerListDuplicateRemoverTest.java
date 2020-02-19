package academy.everyonecodes.java.optionals.sets.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class IntegerListDuplicateRemoverTest {

    IntegerListDuplicateRemover integerListDuplicateRemover = new IntegerListDuplicateRemover();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(3, 6, 10, 53, 107, 2), List.of(3, 3, 6, 10, 53, 53, 107, 2, 2)),
                Arguments.of(List.of(3, 6, 10, 53, 107, 2), List.of(3, 6, 10, 53, 107, 2)),
                 Arguments.of(List.of(3), List.of(3, 3, 3, 3, 3, 3)),
                Arguments.of(List.of(), List.of())
        );

    }

    @ParameterizedTest
    @MethodSource("parameters")
    void remove(List<Integer> expected, List<Integer> numbers) {
        List<Integer> result = integerListDuplicateRemover.remove(numbers);

        Assertions.assertEquals(expected, result);
    }

}