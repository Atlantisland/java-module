package academy.everyonecodes.java.week6.set1.exercise2;

import academy.everyonecodes.java.week6.set1.exercise1.Customer;

public class ScreenNameFormatter {
    public String format(Customer customer) {
        String name = customer.getName();
        if (isBusiness(customer)) {
            return name.toUpperCase();
        }
        return name.toLowerCase();
    }

    private boolean isBusiness(Customer customer) {
        return customer.getCustomerClass().equals("business");
    }

}
