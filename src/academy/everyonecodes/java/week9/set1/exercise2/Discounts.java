package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class Discounts {

    private static List<Discount> discounts = List.of(
            new FiveOnWine(), new TenOnVeggies(), new SevenOnSweets()
    );

    public static List<Discount> get() {
        return discounts;
    }

}
