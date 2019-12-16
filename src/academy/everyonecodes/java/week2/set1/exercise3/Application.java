package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String name = "Bolognese";
        int time = 20;
        List<String> ingredients = List.of("mince meat", "pasta", "salt", "pepper");
        List<String> steps = List.of("cook mince meat", "boil water", "cook pasta");
        Recipe recipe = new Recipe(name, time, ingredients, steps);

    }
}
