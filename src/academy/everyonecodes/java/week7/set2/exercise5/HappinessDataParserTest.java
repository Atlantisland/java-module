package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class HappinessDataParserTest {
    HappinessDataParser parser = new HappinessDataParser();


    @ParameterizedTest
    @MethodSource("parameters")
    void test(Optional<HappinessRecord> oExpected, String input) {

        Optional<HappinessRecord> oResult = parser.parseLine(input);

        Assertions.assertEquals(oExpected, oResult);

    }

    private static Stream<Arguments> parameters() {
        HappinessRecord expectedFirst = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        HappinessRecord expectedSecond = new HappinessRecord("Belgium", 17, 6.89099979400635);

        return Stream.of(
                Arguments.of(Optional.of(expectedFirst), "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904"),
                Arguments.of(Optional.of(expectedSecond), "Belgium;17;6.89099979400635;6.95582075044513;6.82617883756757;1.46378076076508;1.46231269836426;0.818091869354248;0.539770722389221;0.231503337621689;0.251343131065369;2.12421035766602")


        );
    }

    @ParameterizedTest
    @MethodSource("parametersEmpty")
    void testEmpty(String input) {

        Optional<HappinessRecord> oResult = parser.parseLine(input);

        Assertions.assertTrue(oResult.isEmpty());

    }

    private static Stream<Arguments> parametersEmpty() {

        return Stream.of(
                Arguments.of(Optional.empty(), "3232;aaaa;ssqsq;7.04335166752338;6.91064880549908;1.53570663928986;1.55823111534119;0.80978262424469;0.573110342025757;0.42785832285881;0.29838815331459;1.77386903762817")

        );
    }

}


