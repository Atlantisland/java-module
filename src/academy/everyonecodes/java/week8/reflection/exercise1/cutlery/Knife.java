package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import java.util.List;

public class Knife implements Cutlery {

    private List<String> foods = List.of("Fish", "Pizza");

    @Override
    public String getName() {
        return "knife";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return foods.contains(dishName);
    }
}
