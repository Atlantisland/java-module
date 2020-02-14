package academy.everyonecodes.java.week8.set2.exercise1;

public class AdvancedThief implements Thief {
    private int skillLevel = 2;

    @Override
    public void open(Safe safe) {
        int currentDifficultyPoints = safe.getDifficultyPoints();
        safe.setDifficultyPoints(currentDifficultyPoints - skillLevel);
    }

}
