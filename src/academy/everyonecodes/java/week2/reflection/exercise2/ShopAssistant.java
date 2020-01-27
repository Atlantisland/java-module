package academy.everyonecodes.java.week2.reflection.exercise2;



import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ShopAssistant {

    public Cart walkThroughShop(String person) {
        System.out.println("Hello " + person + " , welcome to our shop!");

        List<CartItem> cartItems = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        String productName = scanner.nextLine();

        while (!productName.equals("")) {
            System.out.println("How much does it cost?");
            double productPrice = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("How many do you want?");
            int amount = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Thank you, we will put that in the cart!");

            Product newProduct = new Product(productName, productPrice);
            CartItem newCartItem = new CartItem(newProduct, amount);
            cartItems.add(newCartItem);

            System.out.println("What do you want to buy?");
            productName = scanner.nextLine();
        }

        Cart cart = new Cart(person, cartItems);

        System.out.println("Thank you for shopping with us!");

        return cart;
    }
}