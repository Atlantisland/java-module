package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Move.Move;

import java.util.HashMap;
import java.util.Map;

public class DecisionMaker {

    public String decide(Move move1, Move move2) {
        Map<String, String> rules = new HashMap<>();
        rules.put("rock", "scissors");
        rules.put("scissors", "paper");
        rules.put("paper", "rock");

        if(move1.getName().equals(move2.getName())){
            return "Nobody wins";
        }
        if(move1.getName().equals(rules.get(move2.getName()))){
            return "Player 2 wins";
        }
        return "Player 1 wins";
    }
}
