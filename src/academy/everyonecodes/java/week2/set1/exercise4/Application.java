package academy.everyonecodes.java.week2.set1.exercise4;

import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void explain(Menu menu) {
        System.out.println("These are the available dishes on the menu");
        for (Dish dish : menu.getDishes()) {
            System.out.println(dish.getName() + "for " + dish.getPrice() + "Euro.");
        }
    }

    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        Dish fish = new Dish("fish", 10.70);
        Dish salad = new Dish("salad", 9.30);
        Dish dessert = new Dish("cake", 6);
        dishes.add(fish);
        dishes.add(salad);
        dishes.add(dessert);
        Menu menuOsteria = new Menu("Osteria", dishes);
        explain(menuOsteria);
    }

}
