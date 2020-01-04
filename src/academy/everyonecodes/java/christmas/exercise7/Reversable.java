package academy.everyonecodes.java.christmas.exercise7;

import java.util.ArrayList;
import java.util.List;

public class Reversable {
    public static List<Integer> reverse(List<Integer> elements) {
        int size = elements.size();
        if(size==0) {
            return elements;
        }
        List<Integer> elementsReversed = new ArrayList<>();
        int position = size - 1;
        while(position>=0) {
            int number = elements.get(position);
            elementsReversed.add(number);
            position = position - 1;
        }

        return elementsReversed;

    }
}
