package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalDiscountCalculatorTest {

    TotalDiscountCalculator calculator = new TotalDiscountCalculator();

    static Stream<Arguments> parameters() {
        Product wine = new Product("wine", 10.0);
        Product tomato = new Product("tomato", 2.5);
        Product chocolate = new Product("chocolate", 4.0);
        List<Product> products = List.of(wine, tomato, chocolate);

        return Stream.of(
                Arguments.of(15.47, List.of(wine, tomato, chocolate))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(double expected, List<Product> products) {
        double result = calculator.calculate(products);
        assertEquals(expected, result);
    }
}