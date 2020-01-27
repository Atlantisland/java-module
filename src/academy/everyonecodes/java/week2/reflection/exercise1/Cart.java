package academy.everyonecodes.java.week2.reflection.exercise1;


import java.util.List;

public class Cart {
    private List<CartItem> cartItems;
    private String owner;

    public Cart(String owner, List<CartItem> cartItems) {
        this.owner = owner;
        this.cartItems = cartItems;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public String getOwner() {
        return owner;
    }
}
