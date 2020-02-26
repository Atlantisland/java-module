package academy.everyonecodes.java.week9.Examples1.Exercise2;

import java.util.List;
import java.util.Random;

public class RandomFoodProvider {

    private Random random = new Random();

    private List<String> food;

    public RandomFoodProvider(List<String> food) {
        this.food = food;
    }

    public String provideOneAtRandom() {
        int index = random.nextInt(food.size());
        return food.get(index);
    }
}
