package academy.everyonecodes.java.evaluation2.optionals.Enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MostExpensiveDishesFinderTest {

    MostExpensiveDishesFinder finder = new MostExpensiveDishesFinder();

    @Test
    void test(){
        Dish dish1 = new Dish("salad", DishCategory.STARTER, 5.0);
        Dish dish2 = new Dish("fish", DishCategory.MAINDISH, 20.0);
        Dish dish3 = new Dish("chocolate", DishCategory.DESSERT, 10.0);
        Dish dish4 = new Dish("bruchetta", DishCategory.STARTER, 6.0);
        Dish dish5 = new Dish("pasta", DishCategory.MAINDISH, 10.0);
        Dish dish6 = new Dish("ice-cream", DishCategory.DESSERT, 5.0);
        List<Dish> dishes = List.of(dish1, dish2, dish3, dish4, dish5, dish6);
        List<Dish> result = finder.find(dishes);
        List<Dish> expected = List.of(dish4, dish2, dish3);
        Assertions.assertEquals(expected, result);
    }

}