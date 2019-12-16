package academy.everyonecodes.java.week2.set1.exercise2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("What is the color of the car and in which year was it built?");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        int yearBuilt = scanner.nextInt();
        Car bmw = new Car(color, yearBuilt);
    }
}
