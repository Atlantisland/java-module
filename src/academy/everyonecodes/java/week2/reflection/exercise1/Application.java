package academy.everyonecodes.java.week2.reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("PastaDelicious", 1.0);
        Product product2 = new Product("Milk", 2.0);

        product2.setPrice(1.5);

        CartItem cartItem1 = new CartItem(product1, 3);
        CartItem cartItem2 = new CartItem(product2, 2);

        cartItem2.setAmount(1);
    }
}
