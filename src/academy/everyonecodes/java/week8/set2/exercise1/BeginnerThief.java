package academy.everyonecodes.java.week8.set2.exercise1;

public class BeginnerThief implements Thief {

    @Override
    public void open(Safe safe) {
        int skillLevel = 1;
        int currentDifficultyPoints = safe.getDifficultyPoints();
        safe.setDifficultyPoints(currentDifficultyPoints - skillLevel);
    }
}
