package academy.everyonecodes.java.week2.set1.exercise3;

import academy.everyonecodes.java.week2.examples.BookEntry;

import java.util.List;

public class Recipe {

    private String name;
    private int time;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(String name, int time, List<String> ingredients, List<String> steps) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }
}


