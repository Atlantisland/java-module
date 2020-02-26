package academy.everyonecodes.java.week7.evaluationExercises.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class PictureNameExtractorTest {
    PictureNameExtractor extractor = new PictureNameExtractor();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(List<String> expected, List<String> input) {
        List<String> result = extractor.extract(input);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        List<String> expected = List.of("sunshine", "snowflake", "dereks birthday", "");
        List<String> input = List.of("01222013SunshinePic.jpg", "24122019SnowflakePic.jpg", "01082003Dereks-BirthdayPic.jpg", "01082003Pic.jpg");
        return Stream.of(
                Arguments.of(expected, input),
                Arguments.of(List.of(), List.of())
        );
    }

}