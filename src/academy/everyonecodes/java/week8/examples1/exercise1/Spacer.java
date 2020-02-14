package academy.everyonecodes.java.week8.examples1.exercise1;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Spacer implements Modifier{

    @Override
    public void modify(Phrase phrase){
        String text = phrase.getText();
        String modified = Stream.of(text.split(""))
                .map(character -> character + " ")
                .collect(joining());
        phrase.setText(modified);
    }

}
