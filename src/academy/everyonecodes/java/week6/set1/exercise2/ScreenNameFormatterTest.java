package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ScreenNameFormatterTest {
    ScreenNameFormatter creator = new ScreenNameFormatter();

    @Test
    void createEconomyClass() {
        Customer customer = new Customer("Sanaz", "Economy Class");
        String result = creator.create(customer);
        String expected = "sanaz";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void createBusinessClass() {
        Customer customer = new Customer("Sanaz", "Business Class");
        String result = creator.create(customer);
        String expected = "SANAZ";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void createBusinessClassNameWithNumber() {
        Customer customer = new Customer("Sanaz3", "Business Class");
        String result = creator.create(customer);
        String expected = "SANAZ3";

        Assertions.assertEquals(expected, result);
    }
}