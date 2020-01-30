package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ScreenNameFormatterTest {
    ScreenNameFormatter creator = new ScreenNameFormatter();

    @ParameterizedTest
    @CsvSource({
            "maria, Maria, something else",
            "maria, Maria, economy",
            "MARIA, Maria, business",
    })
    void format(String expected, String name, String customerClass) {
        Customer customer = new Customer(name, customerClass);

        String result = creator.format(customer);

        Assertions.assertEquals(expected, result);
    }

}