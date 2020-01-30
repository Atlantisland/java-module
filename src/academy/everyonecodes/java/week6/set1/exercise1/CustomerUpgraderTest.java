package academy.everyonecodes.java.week6.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CustomerUpgraderTest {
    CustomerUpgrader upgrader = new CustomerUpgrader();

    @ParameterizedTest
    @CsvSource({
            "business, Peter, economy",
            "business, Lisa, business",
    })
    void upgrade(String expected, String name, String customerClass) {
        Customer customer = new Customer(name, customerClass);

        upgrader.upgrade(customer);

        Assertions.assertEquals(expected, customer.getCustomerClass());
    }



}

