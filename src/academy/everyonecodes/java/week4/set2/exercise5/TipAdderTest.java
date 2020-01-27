package academy.everyonecodes.java.week4.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TipAdderTest {
    TipAdder adder = new TipAdder();

    @ParameterizedTest
    @CsvSource({
            "24.50, 23.14",
            "3.0, 2.45",
            "27.0, 25.5",
            "105, 100",
            "10.50, 10",
            "100.00, 95.24"
    })
    void add(double expected, double input) {
        Double result = adder.add(input);
        Assertions.assertEquals(expected, result);
    }

}