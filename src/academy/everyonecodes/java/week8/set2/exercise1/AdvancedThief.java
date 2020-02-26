package academy.everyonecodes.java.week8.set2.exercise1;

public class AdvancedThief implements Thief {
    private int skillLevel = 2;

    @Override
    public void open(Safe safe) {
        int difficultyPoints = safe.getDifficultyPoints();
        int pointsAfterAttempt = difficultyPoints - skillLevel;
        safe.setDifficultyPoints(pointsAfterAttempt);
    }

}
