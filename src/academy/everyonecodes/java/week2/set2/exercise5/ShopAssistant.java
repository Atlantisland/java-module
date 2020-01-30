/*package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    public void findShoeForCustomer(ShoeCustomer shoeCustomer) {
        List<Shoe> shoes = new ArrayList<>();
        Shoe shoeOne = new Shoe(39, "pink");
        shoes.add(shoeOne);
        Shoe shoeTwo = new Shoe(40, "red");
        shoes.add(shoeTwo);
        Shoe shoeThree = new Shoe(38, "blue");
        shoes.add(shoeThree);
        Shoe shoeFour = new Shoe(42, "black");
        shoes.add(shoeFour);

        for (Shoe shoe : shoes) {
            if (!shoeCustomer.tryShoe(shoe)) {
                System.out.println("Nope, this one doesn't fit, sorry!");
            } else {
                System.out.println("I will take the " + shoe.getColor() + " one!");
            }

        }
    }
}

 */
