package academy.everyonecodes.java.week2.reflection.exercise1;

import java.util.List;

public class Cart {
    private List<CartItem> cartItems;
    private String cartItemOwner;

    public Cart(List<CartItem> cartItems, String cartItemOwner) {
        this.cartItems = cartItems;
        this.cartItemOwner = cartItemOwner;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public String getCartItemOwner() {
        return cartItemOwner;
    }
}
