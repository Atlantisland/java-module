package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.Objects;

public class Superman implements Superhero {
    private String privateName = "Kal-El";
    private String superherName = "Superman";

    @Override
    public String getPrivateName() {
        return privateName;
    }

    @Override
    public String getSuperheroName() {
        return superherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superman superman = (Superman) o;
        return Objects.equals(privateName, superman.privateName) &&
                Objects.equals(superherName, superman.superherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privateName, superherName);
    }
}
