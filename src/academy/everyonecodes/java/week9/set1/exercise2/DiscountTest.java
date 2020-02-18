package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiscountTest {

    Discount discount = new Discount(5, List.of("wine"));

    static Stream<Arguments> parameters() {
        Product wine = new Product("wine", 10.0);
        Product tomato = new Product("tomato", 2.5);
        Product chocolate = new Product("chocolate", 4.0);
        Product cheese = new Product("cheese", 6.5);
        //List<Product> products = List.of(wine, tomato, chocolate, cheese);

        return Stream.of(
                Arguments.of(0.5, List.of(wine, tomato, chocolate)),
                Arguments.of(0.5, List.of(wine, tomato, chocolate, cheese)),
                Arguments.of(0.0, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(double expected, List<Product> products) {
        double result = discount.apply(products);
        assertEquals(expected, result);
    }




}