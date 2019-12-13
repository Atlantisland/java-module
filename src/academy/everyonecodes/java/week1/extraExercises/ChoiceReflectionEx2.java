package academy.everyonecodes.java.week1.extraExercises;

import java.util.Scanner;

public class ChoiceReflectionEx2 {

    public static boolean isAtHome() {
        System.out.println("Are you at home?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean isAtHome = true;
        if (!answer.equals("yes")) {
            isAtHome = false;
        }

        return isAtHome;

    }

    public static void greetSomeone() {
        boolean isAtHome = isAtHome();
        Scanner scanner = new Scanner(System.in);
        if (isAtHome) {
            System.out.println("Woof is this person's name?");
            String name = scanner.nextLine();
            System.out.println("Hi there, " + name + "!");
        }
        if (!isAtHome) {
            System.out.println("Woof is this person's name?");
            String name = scanner.nextLine();
            if (name.equals("Derek")) {
                System.out.println("Hi there, Derek!");
            }
            if (name.equals("Hansel")) {
                System.out.println("Hi there, Hansel!");
            }
            if (name.equals("Matilda")) {
                System.out.println("Hi there, Matilda!");

            }
// if (!isAtHome) {
// System.out.println("Woof is this person's name?");
// String name = scanner.nextLine();
// if(name.equals("Derek") || (name.equals("Hansel") || (name.equals("Matilda")) {
// System.out.println("Hi there, " + name + "Derek"!") }

        }

    }

    public static void main(String[] args) {
        greetSomeone();
    }
}