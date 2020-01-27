package academy.everyonecodes.java.optionals.arrays.exercise2;

import java.util.Scanner;

public class TicTacToe {

    public static String[][] getEmptyGameField() {
        String[][] game = {{"[]", "[]", "[]"}, {"[]", "[]", "[]"}};
        return game;
    }

    public static void printGameField(String[][] game) {
        System.out.println(game);
    }

    public static void playOneRound(String[][] game, String player, String symbol) {
        System.out.println(player + ", what is your next move?");
        Scanner scanner = new Scanner(System.in);
        symbol = scanner.nextLine();
        System.out.println(symbol);
        int row = scanner.nextInt();
        System.out.println(row);
        int column = scanner.nextInt();
        System.out.println(column);
        //if(symbol=="")
        game[row][column] = symbol;

    }
}
