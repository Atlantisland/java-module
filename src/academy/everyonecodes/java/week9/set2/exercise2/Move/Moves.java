package academy.everyonecodes.java.week9.set2.exercise2.Move;

import java.util.List;

public class Moves {

    private static List<Move> moves = List.of(
            new Paper(),
            new Rock(),
            new Scissors()

    );

    public static List<Move> get() {
        return moves;
    }

}
