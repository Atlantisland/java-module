package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SuperheroCaller {

    private List<Superhero> superheros;

    public SuperheroCaller() {
        superheros = List.of(new Batman(), new Superman(), new Spiderman());
    }

    public Optional<Superhero> findSuperhero(String keyword) {
        return superheros.stream()
                .filter(getSuperheroPredicate(keyword))
                .findFirst();
    }

    private Predicate<Superhero> getSuperheroPredicate(String keyword) {
        return superhero -> superhero.getPrivateName().equals(keyword) || superhero.getSuperheroName().equals(keyword);
    }
}
