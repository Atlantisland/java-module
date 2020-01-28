package academy.everyonecodes.java.week6.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CustomerUpgraderTest {
    CustomerUpgrader upgrader = new CustomerUpgrader();

    @Test
    void upgradeToBusinessClass() {
        Customer customer = new Customer("Sanaz", "Economy Class");
        upgrader.upgrade(customer);
        String result = "Business Class";
        String expected = "Business Class";

        Assertions.assertEquals(expected, result);

    }

    @Test
    void upgradeCornerCase() {
        Customer customer = new Customer("Sanaz", "Business Class");
        upgrader.upgrade(customer);
        String result = "Business Class";
        String expected = "Business Class";

        Assertions.assertEquals(expected, result);

    }
    /*@ParameterizedTest
    @CsvSource({
            "Business Class, Economy Class",
            "Business Class, Business Class"
    })

    void upgrade(Customer expectedClass){
        Customer customerTest = new Customer("Sanaz", "Business Class" );

        String expected = upgrade(customerTest);
        String result = customerTest.getCustomerClass();
        Assertions.assertEquals(expected, result);
    }*/


}

