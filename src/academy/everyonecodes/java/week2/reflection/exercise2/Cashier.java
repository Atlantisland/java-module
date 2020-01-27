package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

public class Cashier {
    public void billCustomer(Cart cart) {
      double sum = 0;

      for(CartItem cartItem : cart.getCartItems()){
          Product currentProduct = cartItem.getProduct();
          double productPrice = currentProduct.getPrice();
          int amount = cartItem.getAmount();

          double priceForCartItem = amount*productPrice;
          sum = sum + priceForCartItem;

      }
        System.out.println(cart.getOwner() + " has to pay " + sum + " Euro.");
    }
}
