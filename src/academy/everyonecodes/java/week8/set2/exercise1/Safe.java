package academy.everyonecodes.java.week8.set2.exercise1;

import java.util.Objects;

public class Safe {

    private String securityLevel;
    private int difficultyPoints;

    public Safe(String securityLevel, int difficultyPoints) {
        this.securityLevel = securityLevel;
        this.difficultyPoints = difficultyPoints;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return difficultyPoints == safe.difficultyPoints &&
                Objects.equals(securityLevel, safe.securityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityLevel, difficultyPoints);
    }
}

