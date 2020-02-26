package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import java.util.List;

public class LegendaryPercentage {
    private PokemonDataReader reader = new PokemonDataReader();

    public String calculate() {
        List<Pokemon> pokemon = reader.read();
        long legendary = pokemon.stream()
                .filter(element -> element.isLegendary())
                .count();

        System.out.println(legendary);
        int size = pokemon.size();
        System.out.println(size);
        long percentage = (legendary * 100) / size;
        return percentage + "%";
    }
}
