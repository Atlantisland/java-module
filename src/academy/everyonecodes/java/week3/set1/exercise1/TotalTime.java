package academy.everyonecodes.java.week3.set1.exercise1;

import static academy.everyonecodes.java.christmas.exercise2.TramTime.calculateTramTime;
import static academy.everyonecodes.java.christmas.exercise2.WalkingTime.calculateWalkingTime;

public class TotalTime {

    public double calculateTotalTime(double distanceToTram, int numberOfStations, double distanceToFriend) {
        double timeToTram = calculateWalkingTime(distanceToTram);
        int timeForTram = calculateTramTime(numberOfStations);
        double timeToFriendHouse = calculateWalkingTime(distanceToFriend);
        double totalTime = timeToTram + timeToFriendHouse + timeForTram;
        return totalTime;
    }
}
