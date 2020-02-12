package academy.everyonecodes.java.week8.set2.exercise1;

public class AdvancedThief implements Thief{

    @Override
    public void open(Safe safe) {
        int skillLevel = 2;
        int currentDifficultyPoints = safe.getDifficultyPoints();
        safe.setDifficultyPoints(currentDifficultyPoints - skillLevel);
    }

}
