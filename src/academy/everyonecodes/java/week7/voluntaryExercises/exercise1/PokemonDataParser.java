package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;


import java.util.List;
import java.util.Optional;

public class PokemonDataParser {

    public Pokemon parseLine(String line) {
        List<String> pokemons = List.of(line.split(",", -1));
        String name = pokemons.get(1);
        String type1 = pokemons.get(2);
        Optional<String> type2;
        if(pokemons.get(3).length()<1){
            type2= Optional.empty();
        } else{
            type2=Optional.of(pokemons.get(3));
        }
        Boolean legendary = Boolean.valueOf(pokemons.get(12));

        int total = Integer.parseInt(pokemons.get(4));
        int hp = Integer.parseInt(pokemons.get(5));
        int attack = Integer.parseInt(pokemons.get(6));
        int defense = Integer.parseInt(pokemons.get(7));
        int spAtk = Integer.parseInt(pokemons.get(8));
        int spDef = Integer.parseInt(pokemons.get(9));
        int speed = Integer.parseInt(pokemons.get(10));
        int generation = Integer.parseInt(pokemons.get(11));
        Pokemon pokemon = new Pokemon(name, type1, type2, total, hp, attack, defense, spAtk, spDef, speed, generation, legendary);
        return pokemon;
    }
}


