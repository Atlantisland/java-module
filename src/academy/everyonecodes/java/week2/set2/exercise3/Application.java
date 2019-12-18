package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        HikerGatherer hikerGatherer = new HikerGatherer();
        HikeDisplayer hikeDisplayer = new HikeDisplayer();
        List<Hiker> hikers = hikerGatherer.gather();
        Hike hike = new Hike("Sunday 9th November 2019", hikers);
        hikeDisplayer.display(hike);
    }
}
