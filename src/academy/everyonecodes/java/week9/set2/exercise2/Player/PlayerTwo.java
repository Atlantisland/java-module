package academy.everyonecodes.java.week9.set2.exercise2.Player;

import academy.everyonecodes.java.week9.set2.exercise2.Move.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Move.Moves;

import java.util.List;
import java.util.Random;

public class PlayerTwo implements Player {

    private List<Move> moves = Moves.get();

    @Override
    public Move play() {
        Random random = new Random();
        return moves.get(random.nextInt(moves.size()));
    }

    @Override
    public boolean wantsToPlayAgain() {
        return true;
    }
}

//Computer
