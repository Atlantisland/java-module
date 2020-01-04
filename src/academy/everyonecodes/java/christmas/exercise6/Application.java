package academy.everyonecodes.java.christmas.exercise6;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> money = List.of(23, 54, 12, 3, 11);
        int total = 0;
        for(int amount : money) {
            total = total + amount;
        }
        System.out.println("I have a total of " + total + " Euro.");
    }




}
