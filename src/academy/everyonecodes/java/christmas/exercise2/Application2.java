package academy.everyonecodes.java.christmas.exercise2;

import static academy.everyonecodes.java.christmas.exercise2.TotalTime.calculateTotalTime;

public class Application2 {

    public static void main(String[] args) {
        double distanceToTram = 2.5;
        int numberOfStations = 5;
        double distanceToFriend = 1.2;
        double timeCommuting = calculateTotalTime(distanceToTram, numberOfStations, distanceToFriend);
        System.out.println("The total needed time is " + timeCommuting +" min.");

    }
}
