package academy.everyonecodes.java.optionals.enums.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Tshirt> availableShirts;

    public Shop() {
        this.availableShirts = List.of(
                new Tshirt("blue", Size.S, 32),
                new Tshirt("green", Size.XS, 25),
                new Tshirt("red", Size.L, 34),
                new Tshirt("brown", Size.M, 56),
                new Tshirt("orange", Size.XL, 23),
                new Tshirt("yellow", Size.M, 12),
                new Tshirt("black", Size.XS, 69),
                new Tshirt("white", Size.S, 24),
                new Tshirt("gray", Size.M, 15),
                new Tshirt("purple", Size.L, 16)
        );
    }

    public List<Tshirt> getAvailableTShirts() {
        return new ArrayList<>(availableShirts);
    }
}
