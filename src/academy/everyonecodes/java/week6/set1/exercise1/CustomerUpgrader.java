package academy.everyonecodes.java.week6.set1.exercise1;

public class CustomerUpgrader {
    public void upgrade(Customer customer) {
        if (customer.getCustomerClass().equals("Economy Class")) {
            customer.setCustomerClass("Business Class");
        }
    }
}