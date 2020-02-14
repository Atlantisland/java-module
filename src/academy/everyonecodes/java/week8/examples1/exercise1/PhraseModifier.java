package academy.everyonecodes.java.week8.examples1.exercise1;

import java.util.List;

public class PhraseModifier {
    private List<Modifier> modifiers = List.of(new Uppercaser(), new Spacer());

    public void modify(Phrase phrase) {
        modifiers.stream()
                .forEach(modifier -> modifier.modify(phrase));
    }
}
