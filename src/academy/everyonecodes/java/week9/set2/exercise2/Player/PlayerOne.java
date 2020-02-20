package academy.everyonecodes.java.week9.set2.exercise2.Player;

import academy.everyonecodes.java.week9.set2.exercise2.Move.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Move.Moves;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PlayerOne implements Player {
    private Scanner scanner = new Scanner(System.in);
    private List<Move> moves = Moves.get();

    @Override
    public Move play() {
        Optional<Move> oMove = Optional.empty();
        while (oMove.isEmpty()) {
            oMove = askForMove();
        }
        return oMove.get();
    }

    private Optional<Move> askForMove() {
        System.out.println("These are your options: rock, paper, scissors");
        System.out.println("Choose one: ");
        String moveName = scanner.nextLine();
        return moves.stream()
                .filter(move -> move.getName().equals(moveName))
                .findFirst();
    }

    private String getMoveNames() {
        return moves.stream()
                .map(move -> move.getName())
                .collect(Collectors.joining(", "));
    }

    @Override
    public boolean wantsToPlayAgain() {
        System.out.println("Do you want to play again? y/n");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }

}

