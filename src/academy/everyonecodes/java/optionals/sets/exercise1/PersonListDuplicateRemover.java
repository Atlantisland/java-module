package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.*;

public class PersonListDuplicateRemover {

    public List<Person> remove(List<Person> people) {
        Set<Person> setNumbers = new LinkedHashSet<>(people);
        return new ArrayList<>(setNumbers);

    }

}
