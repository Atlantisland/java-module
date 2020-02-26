package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PokemonDataReader {
    private String contentPath = "src/academy/everyonecodes/java/week7/voluntaryExercises/files/pokemon.csv";
    private StreamFileReader reader = new StreamFileReader();
    private PokemonDataParser parser = new PokemonDataParser();

    public List<Pokemon> read(){
        Stream<String> lines = reader.readLines(contentPath);
        List<Pokemon> pokemonList = lines
                .skip(1)
                .map(line -> parser.parseLine(line))
                .collect(Collectors.toList());

        return pokemonList;
    }
}
