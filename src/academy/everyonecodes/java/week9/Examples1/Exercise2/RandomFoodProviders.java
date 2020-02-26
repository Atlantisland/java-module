package academy.everyonecodes.java.week9.Examples1.Exercise2;

import java.util.List;

public class RandomFoodProviders {

    private static List<RandomFoodProvider> providers = List.of(
            new RandomPizzaProvider(), new RandomSaladProvider()
    );

    public static List<RandomFoodProvider> get() {
        return providers;
    }
}
