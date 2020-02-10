package academy.everyonecodes.java.week8.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {

    private List<Superhero> superheros;

    public SuperheroCaller() {
        Superman superman = new Superman();
        Batman batman = new Batman();
        Spiderman spiderman = new Spiderman();
        superheros = List.of(batman, superman, spiderman);
    }

    public Optional<Superhero> findSuperhero(String keyword) {
        return superheros.stream()
                .filter(superhero -> superhero.getPrivateName().equals(keyword) || superhero.getSuperheroName().equals(keyword))
                .findFirst();
    }
}
