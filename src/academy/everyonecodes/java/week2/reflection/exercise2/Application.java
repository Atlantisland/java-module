package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;

public class Application {

    public static void main(String[] args) {
        ShopAssistant shopAssistant = new ShopAssistant();
        Cart dereksCart = shopAssistant.walkThroughShop("Derek");
        Cart hanselsCart = shopAssistant.walkThroughShop("Hansel");

        Cashier cashier = new Cashier();
        cashier.billCustomer(hanselsCart);
        cashier.billCustomer(dereksCart);
    }
}
