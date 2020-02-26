package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Fork implements Cutlery {

    private List<String> foods = List.of("Fish", "Pizza", "Pasta");

    @Override
    public String getName() {
        return "fork";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return foods.contains(dishName);
    }
}
