package academy.everyonecodes.java.christmas.exercise2;

import static academy.everyonecodes.java.christmas.exercise2.TramTime.calculateTramTime;
import static academy.everyonecodes.java.christmas.exercise2.WalkingTime.calculateWalkingTime;

public class TotalTime {

    public static double calculateTotalTime(double distanceToTram, int numberOfStations, double distanceToFriend) {
        double timeToTram = calculateWalkingTime(distanceToTram);
        int timeForTram = calculateTramTime(numberOfStations);
        double timeToFriendHouse = calculateWalkingTime(distanceToFriend);
        double totalTime = timeToTram + timeToFriendHouse + timeForTram;
        return totalTime;
    }
}
