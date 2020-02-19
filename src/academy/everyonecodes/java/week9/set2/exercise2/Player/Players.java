package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.List;

public class Players {

    private static List<Player> players = List.of(
            new PlayerOne(),
            new PlayerTwo()
    );

    public static List<Player> getPlayerOne() {
        return players;

    }

    public static List<Player> getPlayerTwo() {
        return players;

    }
}
