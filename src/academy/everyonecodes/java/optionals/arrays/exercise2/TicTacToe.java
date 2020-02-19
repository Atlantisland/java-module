package academy.everyonecodes.java.optionals.arrays.exercise2;

import java.util.Scanner;

public class TicTacToe {

    private String[][] getEmptyGameField() {
        String[][] game = {new String[3], new String[3], new String[3]};
        for (int i = 0; i < game.length; i++) {
            for (int l = 0; l < game.length; l++) {
                game[i][l] = "[ ]";
            }
        }
        return game;
    }

    private void printGameField(String[][] game) {
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j]);
            }
            System.out.println("");
        }
    }

    public void playOneRound(String[][] game, String player, String symbol) {
        System.out.println(player + ", what is your next move?");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        scanner.nextLine();
        int column = scanner.nextInt();
        scanner.nextLine();
        game[row][column] = "[" + symbol + "]";
        printGameField(game);
    }
}
