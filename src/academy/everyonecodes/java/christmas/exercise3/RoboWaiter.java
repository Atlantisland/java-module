package academy.everyonecodes.java.christmas.exercise3;

import java.util.Scanner;

public class RoboWaiter {

    public static void main(String[] args) {
        double priceBigGear = 6.50;
        double priceMcButtons = 7.20;
        double priceVeggie = 5.70;
        double priceFrenchFries = 2.50;
        double order = 0.0;

        System.out.println("Good day! What burger do you want?");
        Scanner scanner = new Scanner(System.in);
        String burger = scanner.nextLine();

        if(burger.equals("Big Gear Burger")) {
            order = order + priceBigGear;
        }
        if(burger.equals("McButtons Long Burger")) {
            order = order + priceMcButtons;
        }
        if(burger.equals("Veggie Circuits Burger")) {
            order = order + priceVeggie;
        }

        System.out.println("Do you want french fries with that?");
        boolean wantsFrenchFries = scanner.nextBoolean();

        if(wantsFrenchFries) {
            order = order + priceFrenchFries;
        }

        System.out.println("It's " + order + " Euro, please.");
    }
}
