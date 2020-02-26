package academy.everyonecodes.java.week9.Examples1.Exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomFoodProviderTest {

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("food")),
                Arguments.of(List.of("food1", "food2")),
                Arguments.of(List.of("food1", "food2", "food3"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void provideOneAtRandom(List<String> food) {
        RandomFoodProvider provider = new RandomFoodProvider(food);

        String result = provider.provideOneAtRandom();

        assertTrue(food.contains(result));
    }
}