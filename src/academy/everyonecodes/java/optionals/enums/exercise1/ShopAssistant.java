package academy.everyonecodes.java.optionals.enums.exercise1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    private Shop shop;

    public ShopAssistant(Shop shop) {
        this.shop = shop;

    }

    private Size askForSize() {
        System.out.println("What size do you have?");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return Size.valueOf(line);

    }

    private List<Tshirt> findShirtsThatFit(Size size) {
        List<Tshirt> tshirtWihReceivedSize = new ArrayList<>();
        for (Tshirt tshirt : shop.getAvailableTShirts()) {
            if (tshirt.getSize() == size) {
                tshirtWihReceivedSize.add(tshirt);

            }

        }

        return tshirtWihReceivedSize;

    }

    public void dealWithCustomer() {
        System.out.println("Welcome to everyone shops!");
        Size size = askForSize();
        List<Tshirt> tshirtsThatFit = findShirtsThatFit(size);
        if (tshirtsThatFit.size() == 0) {
            System.out.println("I'am sorry, we have no shirts available for your size.");
        } else {
            for (Tshirt tshirt : tshirtsThatFit) {
                System.out.println("We have a " + tshirt.getColor() + " for " + tshirt.getPrice() + " euro.");
            }

        }
    }
}

