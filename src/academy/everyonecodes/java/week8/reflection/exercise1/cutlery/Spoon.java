package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Spoon implements Cutlery {

    private List<String> foods = List.of("Soup");

    @Override
    public String getName() {
        return "spoon";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return foods.contains(dishName);
    }
}
