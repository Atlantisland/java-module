package academy.everyonecodes.java.week9.set2.exercise2;

import academy.everyonecodes.java.week9.set2.exercise2.Move.Move;
import academy.everyonecodes.java.week9.set2.exercise2.Player.Player;
import academy.everyonecodes.java.week9.set2.exercise2.Player.PlayerOne;
import academy.everyonecodes.java.week9.set2.exercise2.Player.PlayerTwo;

public class RockScissorsPaperGame {

    private PlayerOne playerOne = new PlayerOne();
    private PlayerTwo playerTwo = new PlayerTwo();
    private DecisionMaker decisionMaker = new DecisionMaker();

    public void playGame() {
        System.out.println("Let’s play rock, paper, scissors!");
        boolean wantToPlay = true;
        while (wantToPlay) {
            playOneRound(playerOne, playerTwo);
            wantToPlay = askToPlayAgain(playerOne, playerTwo);
        }
        System.out.println("Bye bye butterfly!");
    }

    private void playOneRound(Player playerOne, Player playerTwo) {
        Move move1 = playerOne.play();
        Move move2 = playerTwo.play();
        System.out.println("Player One chose: " + move1.getName());
        System.out.println("Player Two chose: " + move2.getName());
        System.out.println(decisionMaker.decide(move1, move2));
    }

    private boolean askToPlayAgain(Player playerOne, Player playerTwo) {
        return playerOne.wantsToPlayAgain() && playerTwo.wantsToPlayAgain();
    }
}
