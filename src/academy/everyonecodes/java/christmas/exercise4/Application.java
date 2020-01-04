package academy.everyonecodes.java.christmas.exercise4;

import java.util.Scanner;

import static academy.everyonecodes.java.christmas.exercise4.TimeForFirstSeason.getTotalTimeForFirstSeason;

public class Application {
    public static void main(String[] args) {
        System.out.println("How many episodes have you watched?");
        Scanner scanner = new Scanner(System.in);
        int numberOfEpisodes = scanner.nextInt();
        int totalTime = getTotalTimeForFirstSeason(numberOfEpisodes);
        System.out.println("The total amount of time spent watching those episode is " + totalTime + " minutes.");
    }
}
