package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

public class ScreenNameFormatter {
    public String create(Customer customer) {
        String name = customer.getName().toLowerCase();
        if (customer.getCustomerClass().equals("Business Class")) {
            return name.toUpperCase();
        }
        return name;
    }
}
