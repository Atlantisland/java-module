package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;


import java.util.List;
import java.util.Optional;

public class PokemonDataParser {

    public Pokemon parseLine(String line) {
        List<String> parsedLine = List.of(line.split(",", -1));
        String name = parsedLine.get(1);
        String type1 = parsedLine.get(2);
        Optional<String> type2;
        if(parsedLine.get(3).length()<1){
            type2= Optional.empty();
        } else{
            type2=Optional.of(parsedLine.get(3));
        }

        int total = Integer.parseInt(parsedLine.get(4));
        int hp = Integer.parseInt(parsedLine.get(5));
        int attack = Integer.parseInt(parsedLine.get(6));
        int defense = Integer.parseInt(parsedLine.get(7));
        int spAtk = Integer.parseInt(parsedLine.get(8));
        int spDef = Integer.parseInt(parsedLine.get(9));
        int speed = Integer.parseInt(parsedLine.get(10));
        int generation = Integer.parseInt(parsedLine.get(11));
        boolean legendary = Boolean.valueOf(parsedLine.get(12));
        Pokemon pokemon = new Pokemon(name, type1, type2, total, hp, attack, defense, spAtk, spDef, speed, generation, legendary);
        return pokemon;
    }
}


