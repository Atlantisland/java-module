package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top5ScoreFinder {
    private PokemonDataReader reader = new PokemonDataReader();

    public List<String> find() {
        return reader.read().stream()
                .sorted(Comparator.comparing(Pokemon::getTotal).reversed())
                .limit(5)
                .map(Pokemon::getName)
                .collect(Collectors.toList());
    }

}
