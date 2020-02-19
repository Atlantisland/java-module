package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.List;

public class Moves {

    private static List<Move> moves = List.of(
            new Paper("paper"),
            new Rock("rock"),
            new Scissors("scissors")

    );

    public static List<Move> getMove() {
        return moves;
    }

}
