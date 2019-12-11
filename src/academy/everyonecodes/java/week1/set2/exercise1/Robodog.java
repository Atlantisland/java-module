package academy.everyonecodes.java.week1.set2.exercise1;

import java.util.Scanner;


public class Robodog {


    public static int calculateJumps(int foodType) {
        return 6 * foodType;
    }

    public static int calculateBarks(int foodType) {
        return foodType + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Woof food do I get today?");
        int numberOfFoodType = scanner.nextInt();
        int numberOfJumps = calculateJumps(numberOfFoodType);
        int numberOfBarks = calculateBarks(numberOfFoodType);
        System.out.println("I will jump " + numberOfJumps + " times and bark " + numberOfBarks + " times!");
    }
}