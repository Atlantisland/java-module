package academy.everyonecodes.java.optionals.sets.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class BasicDictionaryTest {
    BasicDictionary finder = new BasicDictionary();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("the", "elegant", "jumped", "up"), "The elegant cat jumped up the table"),
                Arguments.of(List.of("the", "weather", "is", "great", "and", "awesome", "for", "skiing"), "The weather is great and is awesome for skiing"),
                Arguments.of(List.of(), "")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void remove(List<String> expected, String text) {
        List<String> result = finder.findUnknownsWords(text);

        Assertions.assertEquals(expected, result);
    }
}
