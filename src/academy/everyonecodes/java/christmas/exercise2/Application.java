package academy.everyonecodes.java.christmas.exercise2;

import static academy.everyonecodes.java.christmas.exercise2.TotalTime.calculateTotalTime;

public class Application {

    public static void main(String[] args) {
        double timeCommuting = calculateTotalTime(2.5, 5, 1.2);
        System.out.println("The total needed time is " + timeCommuting +" min.");

    }
}
