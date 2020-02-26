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
        return Stream.of(
                Arguments.of(0, List.of()),
                Arguments.of(100, List.of(createProduct("item1"))),
                Arguments.of(95, List.of(createProduct("wine"))),
                Arguments.of(90, List.of(createProduct("tomato"))),
                Arguments.of(93, List.of(createProduct("chocolate"))),
                Arguments.of(278,
                        List.of(createProduct("wine"),createProduct("tomato"),createProduct("chocolate"))),
                Arguments.of(378,
                        List.of(createProduct("wine"),createProduct("tomato"),createProduct("chocolate"),
                                createProduct("item1")))
        );
    }

    static Product createProduct(String name) {
        return new Product(name, 100);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(double expected, List<Product> products) {
        double result = calculator.calculate(products);

        assertEquals(expected, result);
    }

}